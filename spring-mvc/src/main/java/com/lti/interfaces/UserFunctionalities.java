package com.lti.interfaces;

import com.lti.entity.User;
import com.lti.entity.UserDTO;

public interface UserFunctionalities {

	public void addUser(User user);
	public User fetchUser(String email);
}
