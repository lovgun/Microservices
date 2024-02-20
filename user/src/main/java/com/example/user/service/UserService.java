package com.example.user.service;



import com.example.user.model.UserDto;
import com.example.user.valueObject.UserDtoresponse;

public interface UserService{

	UserDto save(UserDto user);

	UserDto getUser(int id);

	UserDtoresponse getUserDepartment(int id); 

}
