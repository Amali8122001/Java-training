package com.example.model;

public class SecondApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student shyam = new Student();
		shyam.setRollNumber(1010);
		shyam.setBranch("Computer science");
		shyam.setFirstName("shyam");
		shyam.setMarkScored(89);
		//shyam.setMarkScored(89); is not accessible bcoz diff class=private
		System.out.println("Roll Number:"+shyam.getRollNumber());
		System.out.println("Branch:"+shyam.getBranch());
		System.out.println("First Name:"+shyam.getFirstName());
		System.out.println("Mark Scored:"+shyam.getMarkScored());
	
		
		
		


	}

}
