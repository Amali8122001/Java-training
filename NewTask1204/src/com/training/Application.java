package com.training;

import java.util.*;

import com.training.app2.Appointment;
import com.training.model.Doctor;
import com.training.model.services.Patient;

public class Application {

	public static void main(String[] args) {
		
		Patient preethi = new Patient(2045 , "Preethi" , "Chennai" , 987654332);
		Patient vedha = new Patient(2046 , "Vedha" , "Vellore" , 98758908);
		Patient angelin = new Patient(2047 , "Angelin" , "Madhurai" , 987974332);
		
		Set<Patient> set = new HashSet<Patient>();
		
		set.add(preethi);
		set.add(vedha);
		set.add(angelin);
		
		Doctor doctor = new Doctor (1234 , "Suresh" ,  "cardiologist" ,  set);
		
		 for(Patient eachPatient : doctor.getPatients()) {
			 System.out.println(eachPatient);
			 
			 
		 }
		 
		 System.out.println("=================================");
		 
		    Patient anto = new Patient(2048 , "Anto" , "Trichy" , 999654332);
			Patient shree = new Patient(2049 , "Shree" , "Mumbai" , 98798908);
			Patient jhanu = new Patient(2050 , "Jhanu" , "Coimbatore" , 987971332);
			
			Set<Patient> set1 = new HashSet<Patient>();
			
			set1.add(anto);
			set1.add(shree);
			set1.add(jhanu);
			
			Doctor doctor1 = new Doctor (12345 , "Ramesh" ,  "Dentist" ,  set1);
			
			 System.out.println("doctor:"+ doctor1.getDoctorName());
			 
			 Map<Doctor , Set <Patient>> map = new HashMap<>();
			 
			 map.put(doctor , set);
			 map.put(doctor1 , set1);
			 Appointment app = new Appointment(map);
			 System.out.println(app.getPatients(doctor1));
	

	}	
	
	

}
