package com.training;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student suresh = new Student(101 , "suresh" , LocalDate.of(2001 , 10 , 30),
				                        LocalDateTime.of(2004,  Month.JUNE,5,9,30));
		
		Student senthil = new Student(102 , "senthil" , LocalDate.now(),
                LocalDateTime.now());
		
		System.out.println("Sureshs year of birth"+ suresh.getDateOfBirth().getYear());
		
		System.out.println("Sureshs first birthday:="+ suresh.getDateOfBirth().plus(1 , ChronoUnit.YEARS));
		
		System.out.println("Senthils year of birth"+ senthil.getDateOfBirth().getYear());
		
		System.out.println("Senthils fiftyth birthday:="+ senthil.getDateOfBirth().plus(50 , ChronoUnit.YEARS));

		

	}

}
