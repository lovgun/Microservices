package com.example.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserDto {
	@Id
	private int userId;
	private String userName;
	private int departmentiId;
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getDepartmentiId() {
		return departmentiId;
	}

	public void setDepartmentiId(int departmentiId) {
		this.departmentiId = departmentiId;
	}

	

}
