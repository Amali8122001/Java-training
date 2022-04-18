package com.training;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class App {

	public static void main(String[] args) {
		
		String dateOfBirth = "2001-12-08";
		Student amali = new Student();
		
		amali.setRollNumber(6114);
		amali.setStudentName("Amali");
		amali.setDateOfBirth(LocalDate.parse(dateOfBirth));
		amali.setDateOfJoining(LocalDateTime.now());
		
		System.out.println("Year:="+amali.getDateOfBirth().getYear());
		
		System.out.println("Month:="+amali.getDateOfBirth().getMonth());
		
		System.out.println("Day:="+amali.getDateOfBirth().getDayOfMonth());
		
		LocalTime startTime = LocalTime.of(9,30);
		
		//Duration duration = Duration.of(8, ChronoUnit.HOURS);
		
		LocalTime endTime = startTime.plusHours(8);
		
		System.out.println("Start Time:="+ startTime);
		
		System.out.println("End Time:="+ endTime);
		
		


	}

}
