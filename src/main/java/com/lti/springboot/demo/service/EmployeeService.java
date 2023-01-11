package com.lti.springboot.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.lti.springboot.demo.exception.EmployeeNotFoundExcetion;
import com.lti.springboot.demo.model.Employee;
import com.lti.springboot.demo.repository.EmployeeRepository;

@Service
//public class EmployeeServiceImpl implements EmployeeService {
public class EmployeeService implements IEmployeeService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmployeeRepository empRepository;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList = empRepository.findAll();
		LOG.info(Integer.toString(empList.size()));
		return empList;
	}

	public List<Employee> getAllEmployees(int page, int size, String sort) {
		Pageable pageable = PageRequest.of(page, size, Sort.by(sort));
		Page<Employee> empPage = empRepository.findAll(pageable);
		return empPage.getContent();
	}

	@Override
	public Employee getEmployeeById(int employeeId) { // 101
		LOG.info(Integer.toString(employeeId));
		Optional<Employee> empOptional = empRepository.findById(employeeId);
		if (empOptional.isPresent())
			return empOptional.get();
		else {
			String errorMessage = "Employee with " + employeeId + " is not found.";
			LOG.error(errorMessage);
			throw new EmployeeNotFoundExcetion(errorMessage);
		}

	}

	@Override
	public List<Employee> getEmployeeBySalaryGreaterThan(double salary) {
		return empRepository.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getEmployeeByFirstName(String firstName) {
		List<Employee> empList = empRepository.findByFirstName(firstName);
		if (!empList.isEmpty())
			return empList;
		else {
			String errorMessage = "No employees exist.";
			LOG.error(errorMessage);
			throw new EmployeeNotFoundExcetion(errorMessage);
//			throw new RuntimeException(errorMessage);
		}
	}

	@Override
	public Employee addEmployee(Employee employee) {
		LOG.info(employee.toString());
		return empRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		LOG.info(employee.toString());
		this.getEmployeeById(employee.getEmployeeId());
		return empRepository.save(employee);
	}

	@Override
	public Employee deleteEmployee(int employeeId) {
		LOG.info(Integer.toString(employeeId));
		Employee emp = this.getEmployeeById(employeeId);
		empRepository.deleteById(employeeId);
		return emp;
	}

}

//package com.lti.springboot.demo.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//
//import com.lti.springboot.demo.model.Employee;
//
//@Service
////public class EmployeeServiceImpl implements EmployeeService {
//public class EmployeeService implements IEmployeeService {
//
//	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
//	
//	@Override
//	public List<Employee> getAllEmployees() {
//		List<Employee> empList = new ArrayList<>();
//		empList.add(new Employee(101, "Sonu", 90000));
//		empList.add(new Employee(102, "Monu", 99000));
//		empList.add(new Employee(103, "Tonu", 95000));
//		LOG.info(empList.toString());
//		return empList;
//	}
//
//}
