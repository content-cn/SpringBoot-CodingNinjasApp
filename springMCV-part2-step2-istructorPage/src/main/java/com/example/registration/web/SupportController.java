package com.example.registration.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SupportController {
	
	@RequestMapping(value = "/support")
	public String getSupportPage(@RequestParam String id,ModelMap model) {
		model.addAttribute("message","welcome user "+id);
		return "support";
	}

}
