package com.example.department.service;

import com.example.department.model.Department;

public interface DepartmentService {

	Department save(Department department);

	Department getDepartment(int id);

}
