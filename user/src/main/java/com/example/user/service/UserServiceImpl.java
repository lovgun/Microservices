package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.model.UserDto;
import com.example.user.repository.UserRepository;
import com.example.user.valueObject.Department;
import com.example.user.valueObject.UserDtoresponse;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository repo;
	
	@Autowired
	private RestTemplate template;
	

	@Override
	public UserDto save(UserDto user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public UserDto getUser(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public UserDtoresponse getUserDepartment(int id) {
		// TODO Auto-generated method stub
		UserDtoresponse response = new UserDtoresponse();
		UserDto userDto =repo.findById(id).orElse(null);
		//Department department=template.getForObject("http://localhost:9001/departments/get/"+userDto.getDepartmentiId(),Department.class);
		Department department=template.getForObject("http://DEPARTMENT/departments/get/"+userDto.getDepartmentiId(),Department.class);
		response.setUser(userDto);
		response.setDepartment(department);
		return response;
	}
}


