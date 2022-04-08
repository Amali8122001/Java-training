package com.training.services;

public class StringService {
	
	

	public void stringEquals(String str1 , String str2)
	{
		System.out.println("Is Value Same :="+ str1.equals(str2));
		System.out.println("Are they Pointing Same location:="+ (str1==str2));
	}
	public void stringObjectEquals() {
		String ram = new String("ram");
		String ramesh = new String("ram");
		
		System.out.println("Is Value Same :="+ ram.equals(ramesh));
		System.out.println("Are they Pointing Same location:="+ (ram==ramesh));
		
		
	}
	public String usingTrim(String name) {
		System.out.println("Without Trim:="+ name);
		System.out.println("Trim:="+ name.trim());
		return name.trim();
	}
	
	public void lengthOfString(String name) {
		//String resp = usingTrim(name);
		//System.out.println("String Length:="+ resp.length());
		System.out.println("String Length:="+ name.trim().length());
		
	}
	
	public void usingSubString(String name )  {
		System.out.println("String SubString:="+ name.substring(3));
		System.out.println("String SubString:="+ name.substring(0,3));
	}
	
	public void usingCharAtAndIndexOf(String name) {
		System.out.println("Index Position of @" + name.indexOf('@'));
		System.out.println("Character At Position 6 :=" + name.charAt(6));
	}
	
	public void usingReplace(String str1 , String str2) {
		System.out.println(str1.replace(".com" , ".org" ));
		System.out.println(str2.replace('i', 'y'));
		
	}
	
	public void usingConcat(String str1 , String str2) {
		//string is immutable=can't change
		System.out.println(str1.concat(str2));
		
		//String builder is mutable=change
		StringBuilder builder = new StringBuilder();
		builder.append(str2);
		
		System.out.println(builder.toString());
	}
	
	public void usingCompareTo(String str1 , String str2) {
		System.out.println(str1.compareTo(str2));
	}
	
	public void usingStringFormat(String str1 , double mark) {
		String frmtString = String.format("Name %S", str1);
		
		System.out.println(frmtString);
		
		System.out.println(String.format("Mark %.2f" , mark));
	}
	
	public void usingStringFormat(int mark) {
		System.out.println(String.format("Octal %o", mark));
		System.out.println(String.format("Hexa %x", mark));
	}
	
	public void usingStringFormat(int mark1 , int mark2) {
		System.out.println(String.format("Octal %1$o ,Hexa %2$x" , mark1 , mark2));
		
	}
	
	public void usingStringFormat(String str1 , String str2) {
		System.out.println(String.format(" %1$s , %2$S", str1 , str2));
	}
	
	public void usingStringFormat(double value) {
		System.out.println(String.format("%d", value));
	}

}
