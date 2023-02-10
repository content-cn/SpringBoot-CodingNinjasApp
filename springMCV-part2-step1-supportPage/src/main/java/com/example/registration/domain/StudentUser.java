package com.example.registration.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.registration.repository.DAO;

@Component
public class StudentUser implements User {
	@Autowired
	DAO<StudentUser> studentDAO;
	String userName;
	String location;
	Integer userId;
	String gender;
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public int saveUserDetails() {
		if (userName != null && location != null && gender!= null) {
			int studnetId = studentDAO.save(this);
			System.out.println("new user added" + this.userName + this.location + this.userId + this.gender+" "+studnetId);
			return studnetId;
		} else
			return -1;
	}

	@Override
	public void createUser(String userName, String location, String gender) {
		this.setUserName(userName);
		this.setLocation(location);	
		this.setGender(gender);	
	}


}
