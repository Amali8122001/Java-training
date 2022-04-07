package com.task2;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileBill bill = new MobileBill("SURESH" ,  950021552 , "prepaid");
		Address address = new Address(5,"Nehru Street","SIPCOT","Navalur", "Chennai",612804 );
		System.out.println(bill.findAmount());
		

	}

}
