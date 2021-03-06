package com.training;
import java.util.*;

import com.training.exception.RangeCheckException;
import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = null;
		try {
			ram = new Student(1010,"Ramesh",98);
		} catch (RangeCheckException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		StudentService service = new StudentService(ram);
		System.out.println(service.sendDetails());
		
		Student magesh = new Student();
		magesh.getRollNumber();
		magesh.getFirstName();
		magesh.getMarkScored();
		
		StudentService service2 = new StudentService(ram);
		try {
			  System.out.println("grade:=" +service2.findRank());
			  
		} catch(Throwable e) {
			
		
		System.err.println("Name is not passed");
		}
		
		ExceptionHandling exHandling = new ExceptionHandling();
		exHandling.usingArrayIndexException(args);
		exHandling.usingNumberFormatException("45");   
		
		System.out.println(exHandling.underStandFinallyBlock());
		
		//Since we are using try with resource - scanner will be closed
		
		
		try(Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Enter Number");
			int num = scan.nextInt();
			System.out.println(num);
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		

	}

}
