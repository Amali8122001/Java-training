package com.training.model;

import java.util.List;

public class Application {
	
	public static void print(List<Book> books)       {
//		for(Book eachBook:books) {
//			
//			System.out.println(eachBook);
//			
//		}
		books.forEach(System.out::println);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book java = new Book(101, "Java", "suba", 150);
		Book spring = new Book(102, "Spring", "mad", 650);
		Book maven = new Book(103, "Maven", "Suresh", 550);
		Book html = new Book(104, "Html", "Amali", 50);
		Book python = new Book(105, "Python", "Vedha", 850);
		
		CrudeRepository service = new BookService ();
		
		
		System.out.println("Is Added :=" +service.add(java));
		service.add(spring);
		service.add(maven);
	    service.add(html);
		service.add(python);
		
		System.out.println("Greater than 350");
		List<Book> bookList =(( BookService)service).getBooksGrtthan(350);
		bookList.forEach(System.out::println);
		
		
		//print(service.findAll());
		
				
      //  List<Book> bookList = service.findAll();
        
       // for(Book eachBook:bookList) {
        //	System.out.println(eachBook);
        	
        
        
      // }
//        Book foundBook = service.findById(101);
//        System.out.println("Found Book"+ foundBook);
//        
//        service.remove(python);
//        
        System.out.println("==============");
        print(service.findAll());
        Book react = new Book(105, "React", "Vedha", 1850);
        service.add(react);
        
        print(service.findAll());
        
        
        
        
        Book reactNew = new Book(205, "React", "Vedha sree", 7850);
        service.update(react , reactNew);
        
        Book javaNew = new Book(305, "React", "Amali", 1450);
        service.update(java, javaNew);
        System.out.println("======AFTER UPDATE=======");
        
        print(service.findAll());
        
        
        
                
       
        
        
        
	}

}
