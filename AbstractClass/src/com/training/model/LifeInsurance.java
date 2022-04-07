package com.training.model;

public class LifeInsurance extends Insurance {
	private int Age;
	private int premium = 5000;
	

	public LifeInsurance(int i, String string) {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public LifeInsurance(int policyNumber, String policyHolderName, int age) {
		super(policyNumber, policyHolderName);
		Age = age;
	}




	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium;
		if(Age<50)
		{
		  premium = 10000;
		 
		}
		else {
			premium = 5000;
		}
		return premium;
	}
	
	
	

}
