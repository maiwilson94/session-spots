package com.sessionspots.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	@Column(name="first_name")
	private String firstName;
	
	@NotNull
	@Column(name="last_name")
	private String lastName;
	
	@NotNull
	private String email;
	
	@NotNull
	private String username;
	
	@NotNull
	private String password;
	
	@NotNull
	private boolean enabled = true;

	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private List<UserAuthority> userAuthorities = new ArrayList<UserAuthority>();
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private List<SessionSpot> sessionSpots = new ArrayList<SessionSpot>();
	
	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public Long getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return password;
	}

	public List<UserAuthority> getUserAuthorities() {
		return userAuthorities;
	}

	public String getUsername() {
		return username;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserAuthorities(List<UserAuthority> userAuthorities) {
		this.userAuthorities = userAuthorities;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
