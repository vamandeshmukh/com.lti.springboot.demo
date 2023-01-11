package com.lti.springboot.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	public void testSampleMethod() {

		int expected = 10;
		int actual = 5 + 5;

		assertEquals(expected, actual);

	}

}
