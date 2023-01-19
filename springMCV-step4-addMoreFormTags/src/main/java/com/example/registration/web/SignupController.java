package com.example.registration.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.registration.domain.StudentUser;
import com.example.registration.domain.User;
import com.example.registration.service.RegistrationService;

@Controller
public class SignupController {
	
	@Autowired
	RegistrationService registrationService;
	
	
	@RequestMapping(value = "/signup",method =RequestMethod.GET )
	public String getSignupPage(Model studentModel) {
		User user = registrationService.getNewStudentUser();
		studentModel.addAttribute("user", user);		
		return "signup";
	}

	@RequestMapping(value="/register")
	public String getResposePage(@ModelAttribute("user") StudentUser studentUser) {
	    if(registrationService.registerUser(studentUser.getUserName(),studentUser.getLocation())) {
	    	return "success";
	    }else {
	    	return "signup";
	    } 
	}

}
