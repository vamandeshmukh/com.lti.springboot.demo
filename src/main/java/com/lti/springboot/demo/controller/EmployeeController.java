package com.lti.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.springboot.demo.model.Employee;
import com.lti.springboot.demo.service.IEmployeeService;

@RestController
@RequestMapping("emp")
public class EmployeeController {

	@Autowired
	private IEmployeeService empService;

	@RequestMapping(path = "get-all-emps", method = RequestMethod.GET)
//	@GetMapping("get-all-emps") // same as above 
	public List<Employee> getAllEmps() {
		return empService.getAllEmployees();
	}

	@GetMapping("get-emp-by-id/{eid}")
	public Employee getEmpById(@PathVariable(name = "eid") int employeeId) {
		return empService.getEmployeeById(employeeId);
	}

	@RequestMapping(path = "add-emp", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	public Employee addEmp(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}

	@PutMapping("update-emp")
	public Employee updateEmp(@RequestBody Employee employee) {
		return empService.updateEmployee(employee);
	}

	@DeleteMapping("delete-emp/{eid}")
	public Employee deleteEmp(@PathVariable(name = "eid") int employeeId) {
		return empService.deleteEmployee(employeeId);
	}
}

//package com.lti.springboot.demo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.lti.springboot.demo.model.Employee;
//import com.lti.springboot.demo.service.IEmployeeService;
//
//@RestController
//public class EmployeeController {
//
//	@Autowired
//	private IEmployeeService empService;
//
//	@RequestMapping(path = "get-all-emps", method = RequestMethod.GET)
////	@GetMapping("get-all-emps") // same as above 
//	public List<Employee> getAllEmps() {
//		return empService.getAllEmployees();
//	}
//
//	@GetMapping("get-emp-by-id/{eid}")
//	public Employee getEmpById(@PathVariable(name = "eid") int employeeId) {
//		return empService.getEmployeeById(employeeId);
//	}
//
//	@PostMapping("add-emp")
//	public Employee addEmp(@RequestBody Employee employee) {
//		return empService.addEmployee(employee);
//	}
//
//	@PostMapping("update-emp")
//	public Employee updateEmp(@RequestBody Employee employee) {
//		return empService.updateEmployee(employee);
//	}
//
//	@PostMapping("delete-emp/{eid}")
//	public Employee deleteEmp(@PathVariable(name = "eid") int employeeId) {
//		return empService.deleteEmployee(employeeId);
//	}
//}
