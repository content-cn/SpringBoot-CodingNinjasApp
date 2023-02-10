package com.example.registration.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.websocket.server.PathParam;

@Controller
public class FacultyController {
	@RequestMapping(value = "/faculty/{facultyId}",method =RequestMethod.GET)
	public String getFacultyPage(@PathVariable(value = "facultyId") String facultyId,ModelMap model) {
		model.addAttribute("name", "rahul mohan");
		model.addAttribute("subject","JAVA,Spring,SpringBoot");
		return "instructor";
	}

}
