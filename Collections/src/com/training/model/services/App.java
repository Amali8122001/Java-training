package com.training.model.services;

import java.util.*;

import com.training.model.Book;
import com.training.model.BookService;
import com.training.model.CrudeRepository;
import com.training.util.BookNameComparator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<>();
		
		
		names.add("Vedha");
		names.add("Preethi");
		names.add("Suresh");
		names.add("Christina");
		names.add("Angelin");
		
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		
		Book java = new Book(101, "Java", "suba", 450);
		Book spring = new Book(102, "Spring", "mad", 650);
		Book maven = new Book(103, "Maven", "Suresh", 550);
		Book html = new Book(104, "Html", "Amali", 1450);
		Book python = new Book(105, "Python", "Vedha", 850);
		
		CrudeRepository service = new BookService ();
		
		
		
		System.out.println("Is Added :=" +service.add(java));
		service.add(spring);
		service.add(maven);
	    service.add(html);
		service.add(python);
		//print(service.findAll());
		 List<Book> bookList = service.findAll();
		 Collections.sort( bookList);
		 print(bookList);
		
		
		
		
		Collections.sort(bookList ,new BookNameComparator());
		System.out.println("Sort by Book Name");
		
		print(bookList);
		
		

	}

	private static void print(List<Book> bookList) {
		// TODO Auto-generated method stub
		
	}

	

}
