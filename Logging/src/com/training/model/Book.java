package com.training.model;

import java.util.logging.Logger;

public class Book implements Comparable<Book> {
	
	private int BookNumber;
	private String BookName;
	private String BookAuthor;
	private double Price;
	
	public static Logger log = Logger.getLogger(Book.class.getName());
	public Book() {
		super();
		
		log.info("Book with zero argument construced");
	}
	public Book(int bookNumber, String bookName, String bookAuthor, double price) {
		super();
		this.BookNumber = bookNumber;
		this.BookName = bookName;
		this.BookAuthor = bookAuthor;
		this.Price = price;
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

