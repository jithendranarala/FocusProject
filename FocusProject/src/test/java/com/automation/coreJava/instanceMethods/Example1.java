package com.automation.coreJava.instanceMethods;

import java.util.Scanner;

/* This Example is used to check whether the given number is even or odd */
public class Example1 {
	
	public static void main(String[] args) {

		int number;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter input number");
		
		number = scanner.nextInt();
		
		scanner.close();

		if (number % 2 == 0) {
			System.out.println("Given Number '" + number + "' is an even number");
		} else {
			System.out.println("Given Number '" + number + "' is an add number");
		}
		

	}

}
