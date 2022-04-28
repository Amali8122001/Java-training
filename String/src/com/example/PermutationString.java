package com.example;

import java.util.*;

public class PermutationString {
	
   public static String swapString(String st , int i , int j) {
	   
	   char[] b = st.toCharArray();
	   char ch;
	   ch = b[i];
	   b[i] = b[j];
	   b[j] = ch;
	   return String.valueOf(b);
   }
   public static void generatePermutation(String str , int start , int end) {
		
		if(start == end-1) {
			System.out.println(str);
		} else {
	
		for(int i = start ; i<end ; i++) {
			
			str = swapString(str , start , i);
			generatePermutation(str, start+1, end);
			str = swapString(str , start , i);
		}
		}
	}
   public static void main(String[] args) {
		
		String str ="CAT" ;
		 int len = str.length();
		 System.out.println("Permutations of the strings are:");
		 
		 generatePermutation(str , 0 , len);
	
	
	}

   
}