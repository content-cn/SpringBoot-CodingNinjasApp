package com.example.registration.service;

import com.example.registration.domain.User;

public interface RegistrationService {
	public Boolean registerUser(String userName,String location);
	public User getNewStudentUser();
}
