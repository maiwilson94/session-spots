package com.sessionspots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sessionspots.model.SessionSpot;

@Repository("sessionSpotRepository")
public interface SessionSpotRepository extends JpaRepository<SessionSpot, Long> {
	
}
