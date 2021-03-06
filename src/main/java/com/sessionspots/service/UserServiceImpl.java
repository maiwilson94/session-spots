package com.sessionspots.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sessionspots.model.User;
import com.sessionspots.model.UserInfo;
import com.sessionspots.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public User save(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public User getUser(String email) {
		return userRepository.getUser(email);
	}

	@Override
	public UserInfo getUserInfo(String email) {
		return userRepository.getUserInfo(email);
	}
}
