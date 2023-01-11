package com.lti.springboot.demo.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.lti.springboot.demo.model.Employee;

@ControllerAdvice
public class GLobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundExcetion.class)
	public ResponseEntity<Employee> 
	handleEmployeeNotFoundException(EmployeeNotFoundExcetion e) {

		HttpHeaders headers = new HttpHeaders();
		headers.add("message", e.getMessage());

		return new ResponseEntity<Employee>(null, headers, HttpStatus.NOT_FOUND);

	}

	@Override
	public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		List<String> details = new ArrayList<>();
		for (ObjectError error : ex.getBindingResult().getAllErrors()) {
			details.add(error.getDefaultMessage());
		}
		return new ResponseEntity<Object>(details, HttpStatus.BAD_REQUEST);
	}
}
