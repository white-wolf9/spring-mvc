package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.User;

@Controller
public class RegisterController {

	/*
	 * no need to read  the form data manually
	 * Spring can automatically populate a 
	 * bean object , i.E Spring can automatically
	 * store the data in the object
	 * of a POJO class
	 */
	
	@RequestMapping("/register.lti")
	public String execute (User user ) {
		System.out.println(user);
		return "register.jsp";
		
	}
	
}
