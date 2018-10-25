package com.sessionspots.service;

import com.sessionspots.model.User;
import com.sessionspots.model.UserInfo;

public interface UserService {
	
	User save(User user);
	
	UserInfo getUser(String email);
}
