package com.example.user.valueObject;

import com.example.user.model.UserDto;

public class UserDtoresponse {
	private UserDto user;
	private Department department;
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	}
