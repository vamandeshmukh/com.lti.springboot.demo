package com.lti.springboot.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
//@Table(name = "emp_table", schema = "lti")
@Table(name = "emp_table")
public class Employee {

	@Id
	@Column(name = "employee_id")

	// PostGRE
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	// MySQL
//	@GenericGenerator(name = "emp_seq", strategy = "increment")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")

//	How to generate custom values for PK column?
//  custom sequence in PostGRE
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_sq")
//  @SequenceGenerator(name="your_custom_sequence", sequenceName = "emp_sq", allocationSize=1) 
//  SQL: CREATE SEQUENCE emp_sq START WITH 1010 INCREMENT BY 10;

	private int employeeId;

	@Column(name = "first_name")

	@NotEmpty(message = "firstName must not be empty")
	@Size(max = 32, min = 6, message = "Size of firstName should be between 6 and 32")
	private String firstName;

	@Column(name = "salary")
	private double salary;

	@ManyToOne
	@JoinColumn(name = "departmentId")
	private Department department;

	public Employee() {
		super();
	}

	public Employee(String firstName, double salary) {
		super();
		this.firstName = firstName;
		this.salary = salary;
	}

	public Employee(int employeeId, String firstName, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
	}

	public Employee(int employeeId, String firstName, double salary, Department department) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
		this.department = department;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", salary=" + salary
				+ ", department=" + department + "]";
	}

}
