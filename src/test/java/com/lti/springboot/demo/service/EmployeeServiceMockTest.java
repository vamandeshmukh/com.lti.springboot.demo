package com.lti.springboot.demo.service;

//import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

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

	@MockBean
	EmployeeRepository empRepo;

	@InjectMocks
	EmployeeService empServ;

	@Test
	public void testGetAllEmployees() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee());
		empList.add(new Employee());
		empList.add(new Employee());
		when(empRepo.findAll()).thenReturn(empList);
		assertEquals(empServ.getAllEmployees().size(), 3);
//		Assertions.assertEquals(10, 5 + 5);
	}

	@Test
	public void testGetAllEmployees2() {
		List<Employee> empList = new ArrayList<>();
		when(empRepo.findAll()).thenReturn(empList);
		empServ.getAllEmployees();
		empServ.getAllEmployees();
		empServ.getAllEmployees();
		verify(empRepo, times(3)).findAll();
	}
}
