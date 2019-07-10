package com.lti.controller;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.User;
import com.lti.entity.UserDTO;
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
	public String execute (UserDTO userDTO, Map<String, Object> model) {
		
		//code for processing the uploaded file
		String path = "D:/uploads/";
		String filename = userDTO.getName()+"-"+userDTO.getProfilePic().getOriginalFilename();
		String finalpath = path + filename;
		
		try {
			userDTO.getProfilePic().transferTo(new File(finalpath));	
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		//uF.addUser(user);
		//model.put("user", userDTO.getName());
		return "register.jsp";
	}
	
}
