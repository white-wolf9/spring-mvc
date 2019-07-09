package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "TBL_MVC_USER")
public class User {

	@Id
	@Column(name = "NAME")
	private String name;
	@Column(name = "AGE")
	private String age;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "CITY")
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + ", city=" + city + "]";
	}
	
	
}
