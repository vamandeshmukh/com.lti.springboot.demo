package com.lti.springboot.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	
	@BeforeAll
	public static void setUp() {
		
	}
	
	@AfterAll		
	public static void tearDown() {
		
	}
	
	@BeforeEach
	public void runOnceBefore() {
		
	}

	@AfterEach
	public void runOnceAfter() {
		
	}
	

	@Test
	public void testSampleMethod() {
		int expected = 10;
		int actual = 5 + 5;
		assertEquals(expected, actual);
	}
	
	@Test
	@Disabled
	public void testSampleMethod2() {
		int unexpected = 11;
		int actual = 5 + 5;
		assertNotEquals(unexpected, actual);
	}


}
