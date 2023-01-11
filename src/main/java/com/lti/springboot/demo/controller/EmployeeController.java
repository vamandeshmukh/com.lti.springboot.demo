package com.lti.springboot.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.springboot.demo.model.Employee;
import com.lti.springboot.demo.service.IEmployeeService;

@RestController
@RequestMapping("emp")
public class EmployeeController {

//	http://localhost:9090/swagger-ui/index.html

//	@Autowired

	@Autowired
	private IEmployeeService empService;

	@RequestMapping(path = "get-all-emps", method = RequestMethod.GET)
//	@GetMapping("get-all-emps") // same as above 
	public ResponseEntity<List<Employee>> getAllEmps() {
		List<Employee> empList = empService.getAllEmployees();
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<List<Employee>> response = new ResponseEntity<>(empList, status);
		return response;
	}

	@RequestMapping(path = "get-emps", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmps(@RequestParam(defaultValue = "10") int page,
			@RequestParam(defaultValue = "10") int size, @RequestParam(defaultValue = "employeeId") String sort) {		
		List<Employee> empList = empService.getAllEmployees(page, size, sort);
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<List<Employee>> response = new ResponseEntity<>(empList, status);
		return response;
	}

	@RequestMapping(path = "get-emps-by-salary/{sal}", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmpsBySal(@PathVariable(name = "sal") double salary) {
		List<Employee> empList = empService.getEmployeeBySalaryGreaterThan(salary);
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<List<Employee>> response = new ResponseEntity<>(empList, status);
		return response;
	}

	@GetMapping("get-emp-by-id/{eid}")
	public ResponseEntity<Employee> getEmpById(@PathVariable(name = "eid") int employeeId) {
		Employee emp = empService.getEmployeeById(employeeId);
		ResponseEntity<Employee> response = new ResponseEntity<>(emp, HttpStatus.OK);
		return response;
	}

	@RequestMapping(path = "add-emp", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
//@PostMapping("add-emp") // this also works to the basic
	public ResponseEntity<Employee> addEmp(@Valid @RequestBody Employee employee) {
		Employee emp = empService.addEmployee(employee);
		HttpStatus status = HttpStatus.CREATED;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Employee with eid " + emp.getEmployeeId() + " added successfully.");
		ResponseEntity<Employee> response = new ResponseEntity<>(emp, headers, status);
		return response;
	}

	@PutMapping("update-emp")
	public ResponseEntity<Employee> updateEmp(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(empService.updateEmployee(employee), HttpStatus.CREATED);
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
