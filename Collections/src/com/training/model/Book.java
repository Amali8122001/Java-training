package com.training.model;

public class Book implements Comparable<Book> {
	
	private int BookNumber;
	private String BookName;
	private String BookAuthor;
	private double Price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookNumber, String bookName, String bookAuthor, double price) {
		super();
		BookNumber = bookNumber;
		BookName = bookName;
		BookAuthor = bookAuthor;
		Price = price;
	}
	public int getBookNumber() {
		return BookNumber;
	}
	public void setBookNumber(int bookNumber) {
		BookNumber = bookNumber;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [BookNumber=" + BookNumber + ", BookName=" + BookName + ", BookAuthor=" + BookAuthor + ", Price="
				+ Price + "]";
	}
	@Override
	public int compareTo(Book otherObj) {
		// TODO Auto-generated method stub
		if(otherObj.BookNumber<this.BookNumber) return 1;
		if(otherObj.BookNumber>this.BookNumber) return -1;
		return 0;
		
		//return otherObj.BookName.compareTo(this.BookName);
	}
	

}
