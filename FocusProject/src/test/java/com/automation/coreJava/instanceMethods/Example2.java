package com.automation.coreJava.instanceMethods;

import java.util.Scanner;

/* This Example is used to check whether the given number is even or odd */
public class Example2 {
	
	public void checkEvenOdd(){
		
		int number;

		Scanner scanner = new Scanner(System.in);

		number = scanner.nextInt();
		
		System.out.println("Please enter input number");
		
		scanner.close();

		if (number % 2 == 0) {
			System.out.println("Given Number '" + number + "' is an even number");
		} else {
			System.out.println("Given Number '" + number + "' is an add number");
		}
	}

	/* This Example is used to check whether the given number is even or odd */
	public static void main(String[] args) {
		
		Example2 example2 = new Example2();
		example2.checkEvenOdd();

		
	}

}
