package com.automation.coreJava.instanceMethods;

/* This Example is used to check whether the given number is even or odd */
public class Example5 {

	private int startNumber;
	
	private int endNumber;
	
	public Example5(int number1,int number2){
		startNumber = number1;
		endNumber = number2;
	}
	
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
		Example5 example5 = new Example5(100,1000);
		example5.checkEvenAndOdd();
	}

}
