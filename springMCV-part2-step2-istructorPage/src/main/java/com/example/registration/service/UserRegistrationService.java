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
	public User getNewStudentUser() {
		return studentUser;
	}

	@Override
	public int registerUser(String userName, String location, String gender) {
		studentUser.createUser(userName, location, gender);
		return studentUser.saveUserDetails();
	}

}
