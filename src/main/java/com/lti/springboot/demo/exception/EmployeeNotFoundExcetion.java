package com.lti.springboot.demo.exception;

public class EmployeeNotFoundExcetion extends RuntimeException {

	private static final long serialVersionUID = -1105171247338498695L;

	public EmployeeNotFoundExcetion() {
		super();
	}

	public EmployeeNotFoundExcetion(String message) {
		super(message);
	}

}
