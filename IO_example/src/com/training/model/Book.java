package com.training.model;

import java.io.Serializable;

public class Book implements Comparable<Book> , Serializable {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BookAuthor == null) ? 0 : BookAuthor.hashCode());
		result = prime * result + ((BookName == null) ? 0 : BookName.hashCode());
		result = prime * result + BookNumber;
		long temp;
		temp = Double.doubleToLongBits(Price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (BookAuthor == null) {
			if (other.BookAuthor != null)
				return false;
		} else if (!BookAuthor.equals(other.BookAuthor))
			return false;
		if (BookName == null) {
			if (other.BookName != null)
				return false;
		} else if (!BookName.equals(other.BookName))
			return false;
		if (BookNumber != other.BookNumber)
			return false;
		if (Double.doubleToLongBits(Price) != Double.doubleToLongBits(other.Price))
			return false;
		return true;
	}
	
	private static final long serialVersionID = 2022L;
	private int BookNumber;
	private String BookName;
	private String BookAuthor;
	private double Price;
	private double discount;
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
		return  BookNumber + ","   + BookName + ","  + BookAuthor + "," +Price;
				
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
