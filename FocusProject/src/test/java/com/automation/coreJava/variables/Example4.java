package com.automation.coreJava.variables;

/* This example show how to compare String data types*/
public class Example4 {

	public static void main(String[] args) {
		
		String s1 = "SELENIUM";
		
		String s2 = "SELENIUM";
		
		System.out.println("==:" + (s1 == s2));
		System.out.println("Equals:"+s1.equals(s2));
		
		String s3 = new String("SELENIUM");
		
		String s4 = new String("SELENIUM");
		
		System.out.println("==:" + (s3 == s4));
		System.out.println("Equals:"+s3.equals(s4));

	}

}
