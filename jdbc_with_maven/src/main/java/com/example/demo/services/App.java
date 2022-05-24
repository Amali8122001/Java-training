package com.example.demo.services;

import java.sql.Connection;

import com.example.entity.Product;
import com.example.util.ConnectionFactory;


public class App {

	
	
		

		
		/**
		 * Hello world!
		 *
		 */
		
			
//			public static void member() {
//				
//				Connection con ;
//				try {
//					
//					con = ConnectionFactory.getOracleConnection();
//					
//					MemberRepository rep = new MemberRepository(con);
//					
//					System.out.println(con);
//					
//				}catch(Exception e) {
//					e.printStackTrace();
//				}
//				
//				
//			}
		//	
			public  static void product() {
				
					Connection  con = ConnectionFactory.getOracleConnection();
					
					ProductService service = new ProductService(con);
					
//					Product toAdd = new Product(53, "ups" , 170.00);
//					
//					int rowAdded = service.addProduct(toAdd);
//					
//					System.out.println("Row Added :=" + rowAdded);
//					
					service.findAll().forEach(System.out::println);
					
					Product kathli = new Product(107, "kaju kathli",450.00);
					
					Product vedha = new Product(108, "vedha sree",950.00);
					
					service.usingTxn(kathli ,  vedha);
					
					  
				
			}
			public static void main(String[] args) {
		    {
		    	
		    	product();
		    
		    }
				
		}
				
				
		    	
		    	
		    	
		    	
		    	                                                                                             
		    	
		    	
		    	
		    	
		    	
		    	
		    
		     
		        
//		        Connection con;
//		        
//				try {
//					 int rowAdded =0;
//					  con = ConnectionFactory.getOracleConnection();
//					  
					  //con = ConnectionFactory.getPostgressConnection();
					
					//MemberRepository rep = new MemberRepository(con);
					
					//con = DriverManager.getConnection("Jdbc:Oracle:thin:@10.90.1.105:1521/DEV" , "HR" ,"HR");
					
					//System.out.println(con);
					
//					LocalDate date = LocalDate.of(2021, 4, 12);
//					Date sqlDate = Date.valueOf(date);
					
					
//		           Member toAdd = new Member (93 ,"Angelin" , "chennai" ,LocalDate.of(2010,02 , 12),
//		        		                    "premium",98.00,100,50.00);
//					
//					rowAdded = rep.addMember(toAdd);
//				
//					System.out.println("Row Added :="+rowAdded);
//					
//				
//					
//					System.out.println("====================================");
			
//					rep.findAll().forEach(System.out::println);
//					
//					System.out.println("====================================");
//					
		//   } catch(Exception e) {   	
//		    	e.printStackTrace();
		//   }
		//}

	

}
