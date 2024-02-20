package com.example.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.department.model.Department;
import com.example.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	@Autowired
	private DepartmentService service;

	@PostMapping("/save")
	public Department save(@RequestBody Department department) {
		System.out.println("inside department controller save method executed");
		return service.save(department);
		
	}
	
	@GetMapping("/get/{id}")
	public Department get(@PathVariable("id") int id) {
		return service.getDepartment(id);
	}

}
