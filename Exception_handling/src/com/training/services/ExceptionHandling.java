package com.training.services;

public class ExceptionHandling {
	
	public void usingArrayIndexException(String[] args) {
		try {
			System.out.println(args[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.err.println("Method requires three values to be passed [a,b,c]");
			//e.printStackTrace();
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
	public String underStandFinallyBlock()  {
		int denominator = 0;
		try {
			System.out.println(4/denominator);
			
		} catch (ArithmeticException e) {
			System.err.println("Denominator should not be zero");
			return "welcome";
			
			
		}
		finally {
			System.out.println("Inside Finally ===");
		}
		System.out.println("Thanks , bye , bye");
		return "thanks";
	}
 
}
