package com.lti.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.springboot.demo.model.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

	public abstract AppUser findByUserName(String userName);

}
