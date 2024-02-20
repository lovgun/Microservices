package com.example.department.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {
	@Id
	private int departmentiId;
	private String departmentName;

	public int getDepartmentiId() {
		return departmentiId;
	}

	public void setDepartmentiId(int departmentiId) {
		this.departmentiId = departmentiId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
