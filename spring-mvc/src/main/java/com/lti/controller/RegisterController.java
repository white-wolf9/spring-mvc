package com.lti.controller;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.User;

import com.lti.interfaces.UserFunctionalities;

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
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		UserFunctionalities uF = (UserFunctionalities) context.getBean("userFunc");
		uF.addUser(user);
		System.out.println(user);
		return "register.jsp";
	}
	
}
