package com.example.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.website.domain.User;

@Service
public class StudenUserService implements UserService {
	
	@Autowired
	User studentUser;

	@Override
	public User getUser() {
		return studentUser;
	}

	@Override
	public int signUp(String name, String gender, String location, String college) {
		boolean isStudnetCreated = studentUser.createUser(name, gender, location, college);
		if(isStudnetCreated) {
		return studentUser.saveUser();
		}else {
			return -1;
		}
//		return isStudnetCreated;
	}

}
