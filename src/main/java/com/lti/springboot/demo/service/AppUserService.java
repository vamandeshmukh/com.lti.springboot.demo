package com.lti.springboot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.springboot.demo.model.AppUser;
import com.lti.springboot.demo.repository.AppUserRepository;

@Service
public class AppUserService {

	@Autowired
	private AppUserRepository appUserRepository;

	public AppUser login(AppUser appUser) {
		AppUser user = appUserRepository.findByUserName(appUser.getUserName());
		if (user != null && user.equals(appUser))
			return user;
		else
			throw new RuntimeException();

	}

	public AppUser register(AppUser appUser) {
		AppUser user = appUserRepository.findByUserName(appUser.getUserName());
		if (user != null && user.equals(appUser))
			throw new RuntimeException();
		else
			return user;
	}

}
