package com.lti.springboot.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.springboot.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

//	documentation : https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repository-query-keywords 

//  for basic CRUD ops, methods are already available;
//  for business specific ops, methods need to be declared here as below - 

//	public abstract List<EntityClass> findByFieldName(type fieldName);

	public abstract List<Employee> findBySalaryGreaterThan(double salary);

//	@Query("select e from Employee e where e.firstName = firstName") // use JPQL 
	@Query("select e from Employee e where e.firstName = ?1") // use JPQL 
	public abstract List<Employee> findByFirstName(String firstName);

	// public abstract List<Employee> findBySalaryLessThan(double salary);
//
//	public abstract List<Employee> findBySalaryBetween(double fromSalary, double toSalary);
//	
//	public abstract List<Employee> findBySalary(double salary);

	// xpose apis based on PK values ?

//	==================
//	paging and sorting 
//	==================
	
	

	
	
	
	

}
