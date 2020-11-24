package com.automation.coreJava.loops;

/* Example to show how to use for statement */
/* Sum from start number to end Number */
public class Example2 {

	public static void main(String[] args){

		int startNumber = 1;
		int endNumber = 10;
		int sum =0;

		for (int counter = startNumber; counter <= endNumber; counter++) {
			sum = sum+counter;
		}
		
		System.out.println("Sum from "+startNumber +" to " + endNumber + " is :" + sum);
	}

}
