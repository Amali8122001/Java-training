package com.training;

import java.util.*;

import com.training.model.services.Product;

public class Application {

	public static void main(String[] args) {
		
		
		Product table = new Product(100 , "Table" , 1000);
		Product clock = new Product(101 , "Clock" , 1100);
		Product board = new Product(102 , "Board" , 1200);
		Product bottle = new Product(103 , "Bottle" , 1300);
		Product note = new Product(104 , "Note" , 1400);
		
		Set<Product> set = new HashSet<>();
		
		set.add(table);
		set.add(clock);
		set.add(board);
		set.add(bottle);
		set.add(note);
		
		for(Product eachProduct : set) {
			
			System.out.println(eachProduct.getRatePerUnit());
		}
		
		
		

	}

}
