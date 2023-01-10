package com.lti.springboot.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return empRepository.findAll();
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
