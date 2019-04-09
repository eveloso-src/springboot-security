package com.eduit.springc4.service;

import com.eduit.springc4.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
