package com.training;

import java.util.Optional;

public class UsingOptional {
	
	public static Optional<String> getValue(int key){
		
		Optional<String> response = Optional.empty();
		
		if(key == 1) {
			response = Optional.of("Hello");
		}
		
		return response;
	}
	
	public static Object getString(int key) {
		
		switch (key) {
		
		case 1:
			
			return new String("  chocobar");
			
		case 2:
			
			return new StringBuffer("  cassatta");
			
			default:
				
				return null;
		}
	}

	public static void main(String[] args) {
		
		//will throw null pointer exception for values 3 and above
		
		//System.out.println(getString(3).toString());
		
		//to avoid null pointer exception and return a default value
		//New feature of java 8 optional is used
		
		Optional<Object> optional = Optional.ofNullable(getString(3));
		System.out.println(optional.orElse("Vannila").toString());
		
		Optional<Object> optional2 = Optional.ofNullable(getString(1));
		
		if(optional2.isPresent()) {
			
			System.out.println("Value is Present"+ optional2.get());
			
			
			
		}else {
			System.out.println("Value is not Present");
		}
		
		//Using the lambda expression 
		
		Optional<Object> optional3 = Optional.ofNullable(getString(2));
		optional3.orElseThrow( ()-> new RuntimeException ("No Object for value 2 try again"));
		
        // call the getValue method by passing 1 as argument
		// call the same method again by passing 2 as argument
		//print the result
		
		Optional<String> response = getValue(1);
		
		if(response.isPresent()) {
			System.out.println(response.get().toString());
		
//		} else {
//			System.out.println("Invalid choice enter 1");
//		}
//		System.out.println(response.toString());
		
		response.orElseThrow(()-> new RuntimeException ("No Object for value 2 try again"));
	
	}
		
}
}
	


