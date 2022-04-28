package com.training.model;

import java.util.logging.Logger;

public class LoggingWithPropFile {

	public static void main(String[] args) {
		
		String file = LoggingWithPropFile.class.getClassLoader().getResource("logging.properties").getFile();

		System.out.println(file);
		
		System.setProperty("java.util.logging.config.file" , file);
		
		Book.log.info("Logging properties done right");
		
		Book java = new Book();
		
		Book.log.info(java.toString());
		
		Logger log = Logger.getLogger("com.training.model");
		
		System.out.println(java);
	}

}
