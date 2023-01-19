package com.example.registration.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.registration.domain.StudentUser;

@Repository
public class StudentUserDAO implements DAO<StudentUser>{
	private List<StudentUser> studentUserList = new ArrayList<>();
    
	@Override
	public Optional<StudentUser> get(Integer id) {
		return Optional.ofNullable(studentUserList.get(id));
	}

	@Override
	public int save(StudentUser StudentUser) {
		int studentId = studentUserList.size();
		StudentUser.setUserId(studentId);
		studentUserList.add(StudentUser);
		System.out.println("user saved");
		return studentId;
	}

}
