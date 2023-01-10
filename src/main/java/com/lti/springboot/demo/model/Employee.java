package com.lti.springboot.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "emp_table")
public class Employee {

	@Id
	@Column(name = "employee_id")
	// PostGRE
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// MySQL 
//	@GenericGenerator(name = "emp_seq", strategy = "increment")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	
	private int employeeId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "salary")
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String firstName, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}
