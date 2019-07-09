package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.User;

import com.lti.interfaces.UserFunctionalities;

@Controller
public class RegisterController {

	@Autowired
	UserFunctionalities uF;
	/*
	 * no need to read  the form data manually
	 * Spring can automatically populate a 
	 * bean object , i.E Spring can automatically
	 * store the data in the object
	 * of a POJO class
	 */
	
	@RequestMapping("/register.lti")
	public String execute (User user, Map<String, Object> model) {
		
		uF.addUser(user);
		model.put("user", user.getName());
		//return "redirect:/abc.lti";
		return "register.jsp";
	}
	
}
