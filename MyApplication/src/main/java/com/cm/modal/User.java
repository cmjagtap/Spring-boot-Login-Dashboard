package com.cm.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emptable")

public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String firstname;
	private String lastname;
	private int age;
	private String address;
	private String role;
	private String password;
	private String mail;
	
	public User() {
		
	}

	
	public User(String username,String mail ,String firstname, String lastname, int age, String address, String role , String password) {
		super();
		this.username = username;
		this.mail=mail;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.address=address;
		this.role=role;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail =mail;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	public void setRole(String role) {
		this.role=role;
	}
	public String getRole() {
		return role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}


