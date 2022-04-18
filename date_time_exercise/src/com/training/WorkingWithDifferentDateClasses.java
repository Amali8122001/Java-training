package com.training;

import java.util.*;
import java.sql.*;
import java.time.*;

public class WorkingWithDifferentDateClasses {

	public static void main(String[] args) {
		
		//step-1 creating UTIL date
		java.util.Date date1 = new java.util.Date();
		//java.sql.Date date2 = new java.sql.Date(1020304);
		
		System.out.println(date1);
		
		System.out.println(date1.getTime());
		
		//step- UTIL date to sql date
		
		java.sql.Date date2 = new java.sql.Date(date1.getTime());
		
		System.out.println(date2);
		
		//step-3 sql date to localDate
		
		LocalDate localDate = date2.toLocalDate();
		
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getMonthValue());
		
		//step-4 local date to sql date
		
		java.sql.Date sqlDate =  java.sql.Date.valueOf(localDate);
		
		System.out.println("SQL Date :="+ sqlDate);
		
		

	}

}
