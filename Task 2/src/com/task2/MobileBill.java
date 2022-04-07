package com.task2;

public class MobileBill {
	private String customerName;
	private long mobileNumber;
	private String planName;
	private Address address;
	int value;
	public static final String SERVICEPROVIDER="JIO";
	public MobileBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MobileBill(String customerName, long mobileNumber, String planName) {
		super();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.planName = planName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	public int findAmount() {
		String amount = getPlanName().toLowerCase();
		switch(amount) {
		case "prepaid":
		   value = 200;
		   break;
		case "postpaid":
		value = 300;
		break;
		default:
			value = 0;
			break;
		}
		return value;
		   
		}
	}
	
	
	
	
	


