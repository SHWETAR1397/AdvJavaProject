package com.cdac.service;

import com.cdac.dto.User;

public interface UserServ {
	void addUser(User user);
	boolean findUser(User user);
	String forgotPassword(String userName);
	
}
