package com.training.services;

import java.io.File;

import com.training.model.Book;

public class Application {

	public static void main(String[] args) {
		

	
	
	
		
		Book book = new Book(2345 , "Java" , "Jhanu" , 900);
		
		BookService service = new BookService();
		
		File file = new File ("book.ser");
		
		int ch = 2;
		if ( ch == 1) {
		
			
	   boolean result = service.writeTostream(file, book);
	   
	   if(result) {
		   
		   System.out.println("One Record Serialization");
	   }
		}else {
			
			Book fromFile = (Book) service.readFromStream(file);
			
			System.out.println(fromFile);
			
			System.out.println(fromFile.getBookName());
		

	}

}
}
