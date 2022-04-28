package com.training.model;

import java.util.*;
import static java.util.stream.Collectors.*;

import com.training.model.Book;



public class UsingStreams {
	
	public static void useDistinct(List<Book> bookList)  {
		
		bookList.stream().distinct().forEach(System.out::println);
	}
	
	public static void collectToSet(List<Book> bookList) {
		
		Set<Book> bookSet = bookList.stream().filter(e -> e.getPrice() >500).collect(toSet());
		bookSet.forEach(System.out::println);
	}
	
	public static void collectToMap(List<Book> bookList)  {
		
		Map<String , Double> values = bookList.stream().filter(e ->  e.getPrice() > 500).distinct()
				.collect(toMap(Book::getBookName , Book::getPrice));
		
		values.forEach((key,value) -> System.out.println(key + "," +value));
		
	}
	
	public static void findMaxPrice(List<Book> bookList)  {
		Optional<Book> optional = bookList.stream()
				                     .max(Comparator.comparing(Book::getPrice));
		
		if(optional.isPresent()) {
			System.out.println("Maximum Price:="+optional.get().getPrice());
		}
	}
	
	public static void findMinPrice(List<Book> bookList)  {
		Optional<Book> optional = bookList.stream()
				                     .min(Comparator.comparing(Book::getPrice));
		
		if(optional.isPresent()) {
			System.out.println("Minimum Price:="+optional.get().getPrice());
		}
	}
	
	public static void countContainsV(List<Book> bookList) {
		long count = bookList.stream().filter(e -> e.getBookName().contains("t")).count();
		System.out.println(count);
		
	}



	public static void main(String[] args) {
		
		Book java = new Book(101, "Java", "suba", 150);
		Book spring = new Book(102, "Spring", "mad", 650);
		Book maven = new Book(103, "Maven", "Suresh", 550);
		Book html = new Book(104, "Html", "Amali", 50);
		Book python = new Book(105, "Python", "Vedha", 850);
		Book htmlNew = new Book(104, "Html", "Amali", 50);
		Book pythonNew = new Book(105, "Python", "Vedha", 850);
		
		List<Book> bookList = Arrays.asList(java,spring,maven,html,python,pythonNew,htmlNew);
//		useDistinct(bookList);
//		collectToSet(bookList);
//		collectToMap(bookList);
//		findMaxPrice(bookList);
		
		int key = 6;
				
		switch(key) {
		
		case 1:
			useDistinct(bookList);
			break;
		case 2:
			collectToSet(bookList);
			break;
		case 3:
			collectToMap(bookList);
			break;
		case 4:
			findMaxPrice(bookList);
			break;
		case 5:
			findMinPrice(bookList);
			break;
		case 6:
			countContainsV(bookList);
			break;
			default:
		}
		
	}

}
