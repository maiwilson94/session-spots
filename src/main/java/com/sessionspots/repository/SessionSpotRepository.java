package com.sessionspots.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sessionspots.model.SessionSpot;
import com.sessionspots.model.SessionSpotInfo;

@Repository("sessionSpotRepository")
public interface SessionSpotRepository extends JpaRepository<SessionSpot, Long> {
	
	@Query("Select new com.sessionspots.model.SessionSpotInfo(s.name, s.address, s.latitude, s.longitude, s.price, s.maxSize, s.startDatetime, s.endDatetime) " + 
			"From SessionSpot s")
	List<SessionSpotInfo> getSessionSpots();
}
