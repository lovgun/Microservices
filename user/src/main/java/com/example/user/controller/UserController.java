package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.model.UserDto;
import com.example.user.service.UserService;
import com.example.user.valueObject.UserDtoresponse;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("/save")
	public UserDto save(@RequestBody UserDto user) {
		return service.save(user);
		
	}
	
	@GetMapping("/get/{id}")
	public UserDto get(@PathVariable("id")int id) {
		return service.getUser(id);
	}
	@GetMapping("/getUserDepartment/{id}")
	public UserDtoresponse getUserDepartment(@PathVariable("id")int id) {
		return service.getUserDepartment(id);
	}
}

