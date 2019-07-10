package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.UserDao;
import com.lti.entity.User;
import com.lti.entity.UserDTO;
import com.lti.interfaces.UserFunctionalities;

@Component("userFunc")
public class UserFunctionalitiesImpl implements UserFunctionalities {
	
	@Autowired
	UserDao userDao;

	@Transactional
	public void addUser(User user) {
		userDao.addNewUser(user);
	}
}
