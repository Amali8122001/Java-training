package com.example.demo.services;

public class Invoice {
	
	private int invoiceNumber;
	private String customerName;
	private double quantity;
	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", customerName=" + customerName + ", quantity=" + quantity
				+ "]";
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public Invoice(int invoiceNumber, String customerName, double quantity) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.customerName = customerName;
		this.quantity = quantity;
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getInvoiceNumber() {
		// TODO Auto-generated method stub
		return 0;
	}
	public double getProductRef() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
