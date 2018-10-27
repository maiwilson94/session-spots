package com.sessionspots.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sessionspots.model.SessionSpot;
import com.sessionspots.repository.SessionSpotRepository;

@Service("sessionSpotService")
public class SessionSpotServiceImpl implements SessionSpotService {

	@Autowired
	private SessionSpotRepository sessionSpotRepository;
	
	@Override
	@Transactional
	public SessionSpot save(SessionSpot sessionSpot) {
		return sessionSpotRepository.save(sessionSpot);
	}

}
