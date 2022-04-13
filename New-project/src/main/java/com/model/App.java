package com.model;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	Maven1 maven = new Maven1 ("True Love" , 500 );
    	
        System.out.println(maven.getBookName());
        System.out.println(maven.getBookCost());
        
    }
}
