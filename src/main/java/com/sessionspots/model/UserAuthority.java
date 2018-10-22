package com.sessionspots.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="authorities")
public class UserAuthority {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="authority")
	private String authority = "ROLE_USER";

	@ManyToOne
	private User user;
	
	public String getAuthority() {
		return authority;
	}

	public Long getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
