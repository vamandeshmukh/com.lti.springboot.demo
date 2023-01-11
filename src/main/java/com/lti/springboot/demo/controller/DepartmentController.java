package com.lti.springboot.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.springboot.demo.model.Department;
import com.lti.springboot.demo.service.DepartmentService;

@RestController
@RequestMapping("dep")
public class DepartmentController {

	@Autowired
	private DepartmentService depService;

	@RequestMapping(path = "get-all-deps", method = RequestMethod.GET)
	public ResponseEntity<List<Department>> getAllDeps() {
		List<Department> depList = depService.getAllDepartments();
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<List<Department>> response = new ResponseEntity<>(depList, status);
		return response;
	}

	@RequestMapping(path = "add-dep", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	public ResponseEntity<Department> addDep(@Valid @RequestBody Department department) {
		Department dep = depService.addDepartment(department);
		HttpStatus status = HttpStatus.CREATED;
		ResponseEntity<Department> response = new ResponseEntity<>(dep, status);
		return response;
	}

}
