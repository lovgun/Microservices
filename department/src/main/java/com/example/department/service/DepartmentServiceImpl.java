package com.example.department.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.model.Department;
import com.example.department.repository.DepartmentRepossitory;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepossitory departmentRepo;

	@Override
	public Department save(Department department) {
		// TODO Auto-generated method stub
		return departmentRepo.save(department);
	}

	@Override
	public Department getDepartment(int id) {
		// TODO Auto-generated method stub
		return departmentRepo.findById(id).orElse(null);
	}

}
