package com.example.entity;

import java.sql.Date;
import java.time.LocalDate;

public class Member {
	
	private int memberId;
	private String memberName;
	private String memberAddress;
	private LocalDate accOpenDate;
	private String membershipType;
	private double feesPaid;
	private int maxBookAllowed;
	private double penaltyAmount;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(int memberId, String memberName, String memberAddress, LocalDate accOpenDate,
			String membershipType, double feesPaid, int maxBookAllowed, double penaltyAmount) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.accOpenDate = accOpenDate;
		this.membershipType = membershipType;
		this.feesPaid = feesPaid;
		this.maxBookAllowed = maxBookAllowed;
		this.penaltyAmount = penaltyAmount;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public LocalDate getAccOpenDate() {
		return accOpenDate;
	}
	public void setAccOpenDate(LocalDate accOpenDate) {
		this.accOpenDate = accOpenDate;
	}
	public String getMembershipType() {
		return membershipType;
	}
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}
	public double getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}
	public int getMaxBookAllowed() {
		return maxBookAllowed;
	}
	public void setMaxBookAllowed(int maxBookAllowed) {
		this.maxBookAllowed = maxBookAllowed;
	}
	public double getPenaltyAmount() {
		return penaltyAmount;
	}
	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberAddress=" + memberAddress
				+ ", accOpenDate=" + accOpenDate + ", membershipType=" + membershipType + ", feesPaid="
				+ feesPaid + ", maxBookAllowed=" + maxBookAllowed + ", penaltyAmount=" + penaltyAmount + "]";
	}
	
	

}
