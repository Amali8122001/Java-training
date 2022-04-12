package com.training.model2;

import java.util.*;

import com.training.Student;

public class HashMapApp2 {

	public static void main(String[] args) {
		
		
		Student suresh = new Student (102 , "Suresh" , 100);
		Student amali = new Student(103 , "Amali" , 78);
		Student vedha = new Student(104 , "Vedha" , 88);

		HashMap<Integer , Student> map = new HashMap<>();
		
		map.put(900,  suresh);
		map.put(902, amali);
		map.put(904, vedha);
		
//		System.out.println(map.get(900));
//		System.out.println(map.get(902));
//		System.out.println(map.get(904));
	
		Set<Integer> keys = map.keySet();
		 
		for(Integer key : keys) {
			System.out.println(map.get(key));
		}
		
		Collection<Student> list = map.values();
		 for(Student eachStudent : list) {
			 System.out.println(eachStudent);
		 }
		System.out.println("Both key and value");
		Set<Map.Entry<Integer, Student>> list2 = map.entrySet();
		
		for(Map.Entry<Integer , Student> eachEntry : list2) {
			
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}

	}

}
