package com.lti.springboot.demo.service;

//import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.lti.springboot.demo.model.Employee;
import com.lti.springboot.demo.repository.EmployeeRepository;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class EmployeeServiceMockTest {

//	Quick guide: https://site.mockito.org/ 

	@MockBean
	EmployeeRepository empRepo;

	@InjectMocks
	EmployeeService empServ;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee());
		empList.add(new Employee());
		empList.add(new Employee());
		when(empRepo.findAll()).thenReturn(empList);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetAllEmployees() {
		assertEquals(empServ.getAllEmployees().size(), 3);
//		Assertions.assertEquals(10, 5 + 5);
	}

	@Test
	void testGetAllEmployees2() {
		empServ.getAllEmployees();
		empServ.getAllEmployees();
		empServ.getAllEmployees();
		verify(empRepo, times(3)).findAll();
	}

	@Test
	void testGetAllEmployees3() {
		empServ.getAllEmployees();
//		verify(empRepo, times(3))timeout(3000).
	}
}
