package com.lti.springboot.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.springboot.demo.model.Employee;

@Service
public class EmployeeService {

	public List<Employee> getAllEmployees() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Sonu", 90000));
		empList.add(new Employee(102, "Monu", 99000));
		empList.add(new Employee(103, "Tonu", 95000));
		return empList;
	}

}
