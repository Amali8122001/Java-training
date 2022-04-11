package com.training;
import java.util.*;

public class HashSetApplication {

	public static void main(String[] args) {
		
		Student ram = new Student(101 , "ram" , 88);
		Student suresh = new Student (102 , "Suresh" , 100);
		Student amali = new Student(103 , "amali" , 78);
		Student preethi = new Student(103 , "amali" , 78);
		
		Set<Student> set = new HashSet<>();
		
		set.add(preethi);
		set.add(amali);
		set.add(suresh);
		set.add(ram);
		System.out.println(set);
		System.out.println(set.size());
		
		
		
		
		
	}

}
