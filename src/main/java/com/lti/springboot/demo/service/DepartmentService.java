package com.lti.springboot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.springboot.demo.model.Department;
import com.lti.springboot.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository depRepository;

	public List<Department> getAllDepartments() {
		return depRepository.findAll();
	}

	public Department addDepartment(Department department) {
		return depRepository.save(department);
	}

}
