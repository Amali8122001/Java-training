package com.training;

import java.util.*;

public class HashMapApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student suresh = new Student (102 , "Suresh" , 100);
		Student amali = new Student(103 , "Amali" , 78);
		Student vedha = new Student(104 , "Vedha" , 88);


		
		HashMap<Integer , Student> map = new HashMap<>();
		
		System.out.println(map.put(900, suresh));
		System.out.println(map.put(902, amali));
		Student added = map.put(902, vedha);
		
		if(added!=null) {
			map.put(904, added);
		}
		
		 System.out.println(map.get(900));
		 System.out.println(map.get(904));

	}

}
