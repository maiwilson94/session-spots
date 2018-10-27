package com.sessionspots.service;

import com.sessionspots.model.User;
import com.sessionspots.model.UserInfo;

public interface UserService {
	
	User save(User user);
	
	User getUser(String email);
	
	UserInfo getUserInfo(String email);
}
