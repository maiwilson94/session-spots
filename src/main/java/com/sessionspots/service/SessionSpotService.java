package com.sessionspots.service;

import java.util.List;

import com.sessionspots.model.SessionSpot;
import com.sessionspots.model.SessionSpotInfo;

public interface SessionSpotService {
	
	SessionSpot save(SessionSpot sessionSpot);

	List<SessionSpotInfo> getAllSessionSpots();
}
