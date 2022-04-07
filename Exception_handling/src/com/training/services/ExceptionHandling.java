package com.training.services;

public class ExceptionHandling {
	
	public void usingArrayIndexException(String[] args) {
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Method requires three values to be passed [a,b,c]");
			e.printStackTrace();
		}
	}
	public void usingNumberFormatException(String value) {
		int age = 0;
		try {
			age = Integer.parseInt(value);
			//System.out.println(age);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		System.out.println(age);
		
		
	}
 
}
