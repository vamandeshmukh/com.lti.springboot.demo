package com.lti.springboot.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.springboot.demo.model.Employee;

@SpringBootTest
class EmployeeServiceTest {

	@Autowired
	private IEmployeeService empService;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetAllEmployees() {
		assertEquals(2, empService.getAllEmployees().size());

	}

	@Test
	void testGetEmployeeById() {
		assertEquals(2, empService.getEmployeeById(2));
	}

	@Test
	void testGetEmployeeByFirstName() {

	}

	@Test
	void testAddEmployee() {
		assertEquals("Sonu", empService.addEmployee(new Employee("Sonu", 90000)));
	}

	@Test
	void testUpdateEmployee() {

	}

	@Disabled
	@Test
	void testDeleteEmployee() {
		fail("Not yet implemented");
	}

}
