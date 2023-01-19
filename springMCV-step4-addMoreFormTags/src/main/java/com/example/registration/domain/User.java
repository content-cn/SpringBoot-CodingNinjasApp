package com.example.registration.domain;

public interface User {
	public Boolean saveUserDetails();
	public void setUserId(Integer userId);
	public void createUser(String userName,String Location);
}
