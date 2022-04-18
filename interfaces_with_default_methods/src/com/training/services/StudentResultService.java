package com.training.services;

import com.training.ifaces.AgeCondition;
import com.training.ifaces.Conditional;

public class StudentResultService implements Conditional<Double> {

	@Override
	public boolean test(Double t) {
		// TODO Auto-generated method stub
		return t > 80;
	}
	
    @Override
    
    public boolean negate(Double value) {
   
    	
    	if(value > 100) {
    		return true;
    		
    	} else {
    		return false;
    	}
    	
    }

}
