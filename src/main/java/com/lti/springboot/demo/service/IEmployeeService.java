package com.lti.springboot.demo.service;

import java.util.List;

import com.lti.springboot.demo.model.Employee;

public interface IEmployeeService {

	public abstract List<Employee> getAllEmployees();

	public abstract Employee getEmployeeById(int employeeId);
//
	public abstract Employee addEmployee(Employee employee);
//
//	public abstract Employee updateEmployee(Employee employee);
//
//	public abstract Employee deleteEmployee(int employeeId);
}
