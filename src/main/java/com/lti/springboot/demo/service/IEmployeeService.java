package com.lti.springboot.demo.service;

import java.util.List;

import com.lti.springboot.demo.model.Employee;

public interface IEmployeeService {

	public abstract List<Employee> getAllEmployees();

	public abstract List<Employee> getAllEmployees(int page, int size, String sort);

	public abstract Employee getEmployeeById(int employeeId);

	public abstract List<Employee> getEmployeeBySalaryGreaterThan(double salary);

	public abstract List<Employee> getEmployeeByFirstName(String firstName);

	public abstract Employee addEmployee(Employee employee);

	public abstract Employee updateEmployee(Employee employee);

	public abstract Employee deleteEmployee(int employeeId);
}
