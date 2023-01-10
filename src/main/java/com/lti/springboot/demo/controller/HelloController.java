package com.lti.springboot.demo.controller;

import java.util.Arrays;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Component
@RestController
public class HelloController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

//	http://localhost:9090/hello

	@RequestMapping("/hello")
	public String hello() {
//		System.out.println("Hello");
		LOG.info("hello");
//		LOG.warn("hello warn");
//		LOG.error("hello error");
//		LOG.debug("hello debug");
		return "Hello world! 123";
	}

//	http://localhost:9090/hi

	@RequestMapping("/hi")
	public String hi() {
		System.out.println("Hi");
		return "Hi! How are you?";
	}

//	http://localhost:9090/friends

	@RequestMapping("/friends")
	public List<String> friends() {
		System.out.println("Friends");
		return Arrays.asList("Sonu", "Monu", "Tonu");
	}

}
