package com.training;

public class Hotel {
	private String hotelName;
	private String hotelType;
	private String hotelAddress;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String hotelName, String hotelType, String hotelAddress) {
		super();
		this.hotelName = hotelName;
		this.hotelType = hotelType;
		this.hotelAddress = hotelAddress;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelType() {
		return hotelType;
	}
	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}


}
