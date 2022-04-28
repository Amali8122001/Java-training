package com.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetApplication {

	public static void main(String[] args) {
		
		Student ram = new Student(101 , "ram" , 88);
		Student suresh = new Student (102 , "Suresh" , 100);
		Student amali = new Student(103 , "Amali" , 78);
		Student preethi = new Student(103 , "Amali" , 78);
		
		Set<Student> set = new TreeSet<>();
		
		set.add(preethi);
		set.add(suresh);
		set.add(amali);
		set.add(ram);
		
		for(Student eachStudent:set) {
			System.out.println(eachStudent.getFirstName());
		}
		

	}

}
