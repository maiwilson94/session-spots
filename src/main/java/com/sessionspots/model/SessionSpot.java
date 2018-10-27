package com.sessionspots.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="session_spots")
public class SessionSpot {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String address;
	
	@NotNull
	private double latitude;
	
	@NotNull
	private double longitude;
	
	@NotNull
	@Range(min=0)
	private int price;
	
	@NotNull
	@Column(name="max_size")
	private int maxSize;
	
	@NotNull
	@Column(name="start_datetime")
	private Date startDatetime;
	
	@NotNull
	@Column(name="end_datetime")
	private Date endDatetime;
	
	@ManyToOne
	private User user;

	public String getAddress() {
		return address;
	}

	public Date getEndDatetime() {
		return endDatetime;
	}

	public Long getId() {
		return id;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Date getStartDatetime() {
		return startDatetime;
	}

	public User getUser() {
		return user;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEndDatetime(Date endDatetime) {
		this.endDatetime = endDatetime;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setStartDatetime(Date startDatetime) {
		this.startDatetime = startDatetime;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
