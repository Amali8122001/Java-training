package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
//		int value = Integer.parseInt(args[0]);
//		//value++; because of string we can't increment
//		System.out.println(++value);
		CurrencyConverter conv = new CurrencyConverter();
	    double a = Double.parseDouble(args[0]);
		System.out.println(conv.inrToUsd(a));
		Double inrValue = Double.parseDouble(args[1]);
		System.out.println(conv.inrToEuro(inrValue)); 
		double salary = 42500.00;
		int intSal = (int)salary;
		int age = 45;
		String strAge = Integer.toString(age); //int to string
		int intAge = Integer.valueOf(strAge); // string to int
		
		
		
		
		
	

	}

}
