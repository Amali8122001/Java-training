package com.example;
import com.training.*;

public class EmployeeService {
	public double calculateBonus (Employee object) {
		double salary = object.getEmployeeSalary();
		double bonus = salary * 0.33;
		return bonus;
		
		
	}

}
