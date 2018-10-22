package com.sessionspots.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sessionspots.model.UserAuthority;
import com.sessionspots.repository.UserAuthorityRepository;

@Service("userAuthorityService")
public class UserAuthorityServiceImpl implements UserAuthorityService {

	@Autowired
	private UserAuthorityRepository userAuthorityRepository;
	
	@Override
	@Transactional
	public UserAuthority save(UserAuthority authority) {
		return userAuthorityRepository.save(authority);
	}

}
