package com.training.test;

import java.util.*;

import com.training.Fruit;


public class Main {



	public static void main(String[] args) {
	
	    Fruit apple = new Fruit("APPLE" );
		Fruit orange = new Fruit("ORANGE");
		Fruit apple2 = new Fruit("APPLE");
		Fruit pineapple = new Fruit("PINEAPPLE" );
		Fruit orange2 = new Fruit("ORANGE"  );
		Fruit banana = new Fruit("BANANA" );
		
		Set< Fruit> set = new TreeSet<>();
		
		
		set.add(apple);
		set.add(apple2);
		set.add(orange);
		set.add(orange2);
		set.add(pineapple);
		set.add(banana);
		
		
		for(Fruit  eachFruit:set) {
			
			System.out.println(eachFruit.getFruitName());
		
			
		}
		
		
		
		
		

		
		
		
		
		
	

	}

}
