package com.sessionspots.model;

import java.util.Date;

public class SessionSpotInfo {
	
	private String name;
	private String address;
	private double latitude;
	private double longitude;
	private int price;
	private int maxSize;
	private Date startDatetime;
	private Date endDatetime;
	
	public SessionSpotInfo(String name, String address, double latitude, double longitude, int price, int maxSize,
			Date startDatetime, Date endDatetime) {
		super();
		this.name = name;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.price = price;
		this.maxSize = maxSize;
		this.startDatetime = startDatetime;
		this.endDatetime = endDatetime;
	}
	
	public String getAddress() {
		return address;
	}
	
	public Date getEndDatetime() {
		return endDatetime;
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
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setEndDatetime(Date endDatetime) {
		this.endDatetime = endDatetime;
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
	
}
