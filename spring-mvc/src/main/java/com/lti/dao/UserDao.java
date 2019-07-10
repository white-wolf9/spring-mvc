package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.User;
import com.lti.entity.UserDTO;

@Component
public class UserDao {
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	public void addNewUser(User user) {
		entityManager.persist(user);
	}
	
	public User fetchUser(String email) {
		return entityManager.find(User.class, email);
		
	}

	/*
	 * public User fetch(String email) {
	 * 		return entityManagaer.createQuery("select u from User u where u.email  = :em")
	 * 												.setParameter("em",email)
	 * 												.getSingleResult();
	 * }
	 */
}
