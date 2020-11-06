package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int user_Id;
	@Column(name = "user_name")
	private String user_name;
	@Column(name = "user_pass")
	private String user_pass;
	@Column(name = "user_email")
	private String user_email;
	@Column(name = "user_contact")
	private String user_contact;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return user_Id;
	}
	public void setUserId(int userId) {
		this.user_Id = userId;
	}
	public String getUserName() {
		return user_name;
	}
	public void setUserName(String userName) {
		this.user_name = userName;
	}
	public String getUserPass() {
		return user_pass;
	}
	public void setUserPass(String userPass) {
		this.user_pass = userPass;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_contact() {
		return user_contact;
	}
	public void setUser_contact(String user_contact) {
		this.user_contact = user_contact;
	}
	
	
}
