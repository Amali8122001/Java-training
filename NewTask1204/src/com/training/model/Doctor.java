package com.training.model;

import java.util.*;

import com.training.model.services.Patient;

public class Doctor {
	
	private int doctorId;
	private String doctorName;
	private String department;
	private Set<Patient> patients;
	
	public Doctor() {
		super();
		
	}

	public Doctor(int doctorId, String doctorName, String department, Set<Patient> set) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.department = department;
		this.patients = (Set<Patient>) set;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Set<Patient> getPatients() {
		return patients;
	}

	public void setPatients(Set<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", department=" + department
				+ ", patients=" + patients + "]";
	}
	
	

}
