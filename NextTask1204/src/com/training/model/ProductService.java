package com.training.model;

import java.util.*;

import com.training.model.services.Product;

public class ProductService {
	
	public List<Product> getTopThree() {
	int i;
	for(i=0;i<=3;i++) {
		System.out.println("Top 3 Products are:" +i);
	}
		
	return this.getTopThree();
	}

}
