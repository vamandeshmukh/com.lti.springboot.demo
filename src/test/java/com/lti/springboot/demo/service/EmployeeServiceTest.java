package com.lti.springboot.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServiceTest {

//	Quick guide: https://junit.org/junit5/docs/current/user-guide/#writing-tests-annotations 

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
		assertEquals(4, empService.getAllEmployees().size());
	}

	@Test
	@Disabled
	void testGetAllEmployeesDisabled() {
		assertEquals(4, empService.getAllEmployees().size());
	}

	@Test
	void testGetAllEmployeesTimeout() {
		assertEquals(4, empService.getAllEmployees().size());
	}

	@Test
	@Timeout(2)
	void testGetAllEmployeesTimeout2() {
		Assertions.assertTimeout(Duration.ofSeconds(3), () -> {
			empService.getAllEmployees();
		});
	}

	@Test
	@DisplayName("test getAllEmployees()")
	void testGetAllEmployeesWithDisplayName() {
		assertEquals(4, empService.getAllEmployees().size());
	}

	@Test
	@Order(1)
	void testGetAllEmployeesInOrder() {
		assertEquals(4, empService.getAllEmployees().size());
	}

	@Test
	void testGetEmployeeByIdExpectException() {
		RuntimeException e = assertThrows(RuntimeException.class, () -> {
			empService.getEmployeeByFirstName("Crazy Guy");
		});
		assertEquals(e.getMessage(), "No employees exist.");
	}

	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 5 })
	void testGetEmployeeById(int employeeId) {
		assertEquals(employeeId, empService.getEmployeeById(employeeId).getEmployeeId());
	}

//	@ParameterizedTest for methods with two args 
//	@ParameterizedTest
//	@CsvSource({"a,1", "b,2", "foo,3"})
//	public void testParameters(String name, int value) {
//	    System.out.println("csv data " + name + " value " + value);
//	}
//
//	@ParameterizedTest
//	@MethodSource("provideParameters")
//	public void testParametersFromMethod(String name, int value) {
//	    System.out.println("method data " + name + " value " + value);
//	}
//
//	private static Stream<Arguments> provideParameters() {
//	    return Stream.of(
//	            Arguments.of("a", 1),
//	            Arguments.of("b", 2),
//	            Arguments.of("foo", 3)
//	    );
//	}

}
