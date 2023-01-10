package com.lti.springboot.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.springboot.demo.model.Employee;

@RestController
public class EmployeeController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("get-all-emps")
	public List<Employee> getAllEmps() {
		LOG.info("getAllEmps");
		return null;
	}

}
