package com.lti.springboot.demo.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "dept_table")
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "department_id")
	private int departmentId;

	@Column(name = "department_name")
	String departmentName;

	@Column(name = "city")
	private String city;

//	see main class 
	@Column(name = "created_on", nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
//	private Date createdOn;
	private LocalDateTime createdOn;
	public Department() {
		super();
	}

	public Department(int departmentId, String departmentName, String city) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.city = city;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
