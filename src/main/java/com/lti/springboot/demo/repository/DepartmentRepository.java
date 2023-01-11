package com.lti.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.springboot.demo.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
