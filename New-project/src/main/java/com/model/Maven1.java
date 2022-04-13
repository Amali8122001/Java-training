package com.model;

public class Maven1 {
	private String bookName;
	private int bookCost;
	public Maven1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Maven1(String bookName, int bookCost) {
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
	@Override
	public String toString() {
		return "Maven1 [bookName=" + bookName + ", bookCost=" + bookCost + "]";
	}
	

}
