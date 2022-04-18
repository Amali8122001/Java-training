package com.training;

import java.util.Arrays;
import java.util.*;

public class App2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("India" , "Srilanka" , "Indonesia" , "Bhutan");
		
//		for(String eachName : names) {
//			System.out.println(eachName);
//		}
		
		//or
		
		//names.forEach(value -> System.out.println(value));
		
		//Method reference
		names.forEach(System.out::println);
		
		
		
	}

}
