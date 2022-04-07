package com.example;
import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student();
		//ram.rollNumber =101;
		ram.setRollNumber(56020); //due to diff packages we are not able to access=default
		ram.setFirstName("Ram"); //due to non-subclass of diff packages we are not able to access=protected
		ram.setMarkScored(99); //due to private we aren't able to access=private
		System.out.println("Roll Number :="+ram.getRollNumber());
		System.out.println("Mark Scored:="+ram.getMarkScored());
		System.out.println("Student Name:="+ram.getFirstName());
		Student shyam = new Student(1010, "Shyam" , 89, "Computer science");
		System.out.println("Roll Number:="+ shyam.getRollNumber());
		System.out.println("Student Name:="+ shyam.getFirstName());
		Student magesh = new Student(49, "Magesh", "CSE");
		System.out.println("Roll Number:="+ magesh.getRollNumber());
		System.out.println("Mark Scored:="+ magesh.getMarkScored());
		
		
		

	}

}
