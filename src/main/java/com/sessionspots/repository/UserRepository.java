package com.sessionspots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sessionspots.model.User;
import com.sessionspots.model.UserInfo;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("Select u From User u where email = ?1")
	User getUser(String email);
	
	@Query("Select new com.sessionspots.model.UserInfo(u.id, u.firstName, u.lastName, u.email, u.username) " +
			"From User u where u.email = ?1")
	UserInfo getUserInfo(String email);
	
}
