package com.training.model;

public class HealthInsurance extends Insurance {
	private String[] preExistingDisease;
	public HealthInsurance( int i, String string, String[] illness) {
		super();
	}
//	@Override
//	public double calculatePremium() {
//		// TODO Auto-generated method stub
//		double premium = 10000;
//		for (String eachItem : preExistingDisease) {
//			String item = eachItem.toLowerCase();
//			if(eachItem.equals("BP") || eachItem.equals("sugar")) {
//				premium = 15000;
//				
//				
//			}
//			
//		}
//		return premium;
//	}
//	
	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium = 10000;
		for(String eachItem : preExistingDisease) {
			String item = eachItem.toLowerCase();
			if(eachItem.equals("bp") || eachItem.equals("sugar")) {
				premium = 15000;
			}
		}
		return premium;
	}

}
