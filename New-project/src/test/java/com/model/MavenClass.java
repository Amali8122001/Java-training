package com.model;

public class MavenClass {
	
	private String bookName;
	private int bookCost;
	
	public MavenClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MavenClass(String bookName, int bookCost) {
		super();
		this.bookName = bookName;
		this.bookCost = bookCost;
		
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookCost() {
		return bookCost;
	}
	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}
	
	
	

}
