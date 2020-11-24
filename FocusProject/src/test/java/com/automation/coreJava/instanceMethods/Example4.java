package com.automation.coreJava.instanceMethods;

/* This Example is used to check whether the given number is even or odd */
public class Example4 {

	private int startNumber = 1;
	
	private int endNumber = 100;
	
	public void checkEvenAndOdd(){
				
		while(startNumber!=endNumber){
			if (startNumber % 2 == 0) {
				System.out.println("Given Number '" + startNumber + "' is an even number" + "\t");
			} else {
				System.out.print("Given Number '" + startNumber + "' is an add number" + "\t");
			}
			startNumber++;
		}

	}

	public static void main(String[] args) {
		Example4 example4 = new Example4();
		example4.checkEvenAndOdd();
		
	}

}
