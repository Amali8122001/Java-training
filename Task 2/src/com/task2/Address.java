package com.task2;

public class Address {
	private int doorNumber;
	private String streetName;
	private String placeName;
	private String cityName;
	private String districtName;
	private int pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int doorNumber, String streetName, String placeName, String cityName, String districtName,
			int pincode) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.placeName = placeName;
		this.cityName = cityName;
		this.districtName = districtName;
		this.pincode = pincode;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	


}
