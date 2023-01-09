package com.lti.springboot.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Component
@RestController
public class HelloController {

//	http://localhost:9090/hello

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("Hello");
		return "Hello world!";
	}

	@RequestMapping("/hi")
	public String hi() {
		System.out.println("Hi");
		return "Hi! How are you?";
	}

	@RequestMapping("/friends")
	public List<String> friends() {
		System.out.println("Friends");
		return Arrays.asList("Sonu", "Monu", "Tonu");
	}

}
