package com.lti.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//	http://localhost:9090/hello

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("Hello");
		return "Hello world!";
	}

}
