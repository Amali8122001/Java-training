package com.training;

import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student(1010,"Ramesh",98);
		StudentService service = new StudentService(ram);
		System.out.println(service.sendDetails());
		StudentService service2 = new StudentService(ram);
		try {
			  System.out.println("grade" +service2.findRank());
			  
		} catch(Throwable e) {
			
		
		System.err.println("Name is not passed");
		}
		
		ExceptionHandling exHandling = new ExceptionHandling();
		exHandling.usingArrayIndexException(args);
		exHandling.usingNumberFormatException("45");                               
		

	}

}
