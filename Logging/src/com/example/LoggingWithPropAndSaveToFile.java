package com.example;

import java.io.IOException;
import java.util.logging.FileHandler;

import com.training.model.Book;
import com.training.model.LoggingWithPropFile;

public class LoggingWithPropAndSaveToFile {

	public static void main(String[] args) {
	
		String file = LoggingWithPropFile.class.getClassLoader().getResource("logging.properties").getFile();
				
				System.setProperty("java.util.logging.config.file", file);
		
		        FileHandler handler;
				try {
					handler = new FileHandler("logs2.log");
					
					 Book.log.addHandler(handler);
				        
				        Book.log.info("Logging properties done right");
				        
				        Book java = new Book();
				        
				        Book.log.info(java.toString());

				} catch (SecurityException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		       
	}

}
