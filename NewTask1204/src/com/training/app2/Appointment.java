package com.training.app2;

import java.util.*;


import com.training.model.Doctor;
import com.training.model.services.Patient;

public class Appointment {

	private Map<Doctor, Set<Patient>>list;
	
	
//	public Appointment() {
//		super();
//		// TODO Auto-generated constructor stub
//	}


	public Appointment(Map<Doctor, Set<Patient>> list) {
		super();
		this.list = list;
	}


	public Map<Doctor, Set<Patient>> getList() {
		return list;
	}


	public void setList(Map<Doctor, Set<Patient>> list) {
		this.list = list;
	}


	@Override
	public String toString() {
		return "Appointment [list=" + list + "]";
	}
	
	public Set<Patient> getPatients(Doctor key) {
		return this.list.get(key);
	}
	
	



		
}
