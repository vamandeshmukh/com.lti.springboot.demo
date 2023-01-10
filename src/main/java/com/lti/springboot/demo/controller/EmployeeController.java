package com.lti.springboot.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.springboot.demo.model.Employee;
import com.lti.springboot.demo.service.IEmployeeService;

@RestController
public class EmployeeController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IEmployeeService empService;

	@RequestMapping("get-all-emps")
	public List<Employee> getAllEmps() {
		LOG.info("getAllEmps");
		return empService.getAllEmployees();
	}

}


