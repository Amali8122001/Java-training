package com.example.model;

public class Student {
	private int rollNumber;
	private String firstName;
	private String branch;
	
	
	public Student(int rollNumber, String firstName, String branch) {
		this(rollNumber, firstName,99,branch);
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
	}
	public Student(int rollNumber, String firstName, String branch, double markScored) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
		this.markScored = markScored;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber2, String firstName2, int i, String branch2) {
		// TODO Auto-generated constructor stub
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	private double markScored;
	public int getRollNumber() {
		return rollNumber;
	}
    void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	

}
