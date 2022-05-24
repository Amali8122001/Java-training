package com.example.demo;

import java.sql.*;
import java.util.Optional;

import com.example.demo.services.ProductService;
import com.example.entity.Product;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con;
		try {
			con = DriverManager.getConnection("Jdbc:Oracle:thin:@10.90.1.105:1521/DEV" , "HR" ,"HR");
			
			ProductService service = new ProductService(con);
//			
			//Product toAdd = new Product (93 ,"sim" , 98.00);
			
			//int rowAdded = service.addProduct(toAdd);
			
			//System.out.println("Row Added :="+rowAdded);
	
			//service.findAll().forEach(System.out::println);
			
			//System.out.println("====================================");
			
			int rowsUpdated = service.updatePriceByName("laptop", 400);
			
			System.out.println("Rows Updated:=" + rowsUpdated);
			
			service.findAll().forEach(System.out::println);
			
			int rowsDeleted = service.deleteById(17);
			
			System.out.println("Row Deleted :="+ rowsDeleted);
		
			service.findAll().forEach(System.out::println);
			
			System.out.println("=========find by id===========");
			
			Optional<Product>found = service.findById(20);
			
			if(found.isPresent()) {
				
				System.out.println(found.get());
			} else {
				
				System.out.println("Product with given id not present");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
