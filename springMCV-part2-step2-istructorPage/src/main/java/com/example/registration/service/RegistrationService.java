package com.example.registration.service;

import com.example.registration.domain.User;

public interface RegistrationService {
	public int registerUser(String userName,String location,String gender);
	public User getNewStudentUser();
}
