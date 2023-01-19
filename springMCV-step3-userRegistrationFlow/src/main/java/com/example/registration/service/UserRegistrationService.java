package com.example.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.domain.StudentUser;
import com.example.registration.domain.User;

@Service
public class UserRegistrationService implements RegistrationService {
	
	@Autowired
	User studentUser;
	
	@Override
	public Boolean registerUser(String userName, String location) {
		studentUser.createUser(userName, location);
		return studentUser.saveUserDetails();
	}

	@Override
	public User getNewStudentUser() {
		return studentUser;
	}

}
