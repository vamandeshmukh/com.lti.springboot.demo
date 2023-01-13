package com.lti.springboot.demo.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	Logger LOG = LoggerFactory.getLogger(this.getClass());

	@GetMapping("hi")
	public String hi() {
		LOG.info("hi");
		return "Delete this API later.";
	}

}
