package com.sessionspots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sessionspots.model.UserAuthority;

@Repository("userAuthorityRepository")
public interface UserAuthorityRepository extends JpaRepository<UserAuthority, Long> {
	
}
