package com.training;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {

	public static void main(String[] args) {
		
		
	   
		
		Logger log = Logger.getLogger(Application.class.getClass().getName());
		
		log.setLevel(Level.ALL);
		
		log.info("Info msg");
		
		log.warning("Warning msg*************");
		
		log.severe("severe msg %%%%%%%%%%%%%%");
		
		log.fine("Fine msg####################");
		
		//System.out.println("Info msg");

	}

}
