package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.User;

@Component
public class UserDao {
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	public void addNewUser(User user) {
		entityManager.persist(user);
	}

}
