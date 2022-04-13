package com.training.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BookService implements CrudeRepository {
	
	private ArrayList<Book> bookList;
	
	public BookService()  {
		super();
		this.bookList = new ArrayList<>();
	}

	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		//boolean result = bookList.add(book);
		//return result;
		return bookList.add(book);
	}

	@Override
	public Book findById(int id) {
		// TODO Auto-generated method stub
		
	    Book found = null ;
			
			for(Book eachBook : this.bookList) {
			if(eachBook.getBookNumber()==id) {
				found = eachBook;		
			}
		}
		return found;
	}

	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return this.bookList.remove(book);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	@Override
	public Book update(Book oldBook , Book newBook) {
		// TODO Auto-generated method stub
		if(this.bookList.contains(oldBook)) {
			//System.out.println("Inside if block #####");
			int idxPos = this.bookList.indexOf(oldBook);
			this.bookList.set(idxPos, newBook);
			
		}
		
		return newBook;
	}
	
	public List<Book> getBooksGrtthan(double price) {
		
		List<Book> grtThanList = new ArrayList<>();
		Predicate<Double> grtThan =  (value) -> value > price;
		
		this.bookList.forEach(book -> 
		{
			
			double bookPrice = book.getPrice();
			
		if (grtThan.test(bookPrice)) { 
		grtThanList.add(book);
		}
		});
		return grtThanList;9d
		
		
	}
	
	

}
