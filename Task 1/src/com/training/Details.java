package com.training;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus = new Customer();
		cus.setCustomername("Veda");
		cus.setCustomerId(12345);
		cus.setCustomerAddress("Nehru street,Chennai");
		System.out.println("Customer Name:="+cus.getCustomername());
		System.out.println("Customer Id:="+cus.getCustomerId());
		System.out.println("Customer Address:="+cus.getCustomerAddress());
		Employee emp = new Employee();
		emp.setEmployeeName("Amali");
		emp.setEmployeeId(98765);
		emp.setEmployeeRole("Java Developer");
		emp.setEmployeeSalary(20000);
		System.out.println("Employee Name:="+emp.getEmployeeName());
		System.out.println("Employee Id:="+emp.getEmployeeId());
		System.out.println("Employee Role:="+emp.getEmployeeRole());
		System.out.println("Employee Salary:="+emp.getEmployeeSalary());
		Hotel htl = new Hotel();
		htl.setHotelName("Aanandha Bhavan");
		htl.setHotelType("North Indian");
		htl.setHotelAddress("First Cross Road , Chennai");
		System.out.println("Hotel Name:="+htl.getHotelName());
		System.out.println("Hotel Type:="+htl.getHotelType());
		System.out.println("Hotel Address:="+htl.getHotelAddress());
		System.out.println("   ");
		EmployeeService empSer = new EmployeeService();
		System.out.println("Employee Bonus:="+empSer.calculateBonus(emp));
		
	}

	}

