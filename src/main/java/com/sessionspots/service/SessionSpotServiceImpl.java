package com.sessionspots.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sessionspots.model.SessionSpot;
import com.sessionspots.model.SessionSpotInfo;
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
	
	@Override
	public List<SessionSpotInfo> getAllSessionSpots() {
		return sessionSpotRepository.getSessionSpots();
	}

}
