package com.automation.coreJava.staticMethods;

import java.util.Scanner;

/* Example to show how to write static method*/
public class Example1 {

	public static void factorial(int number) {

		int factorial = 1;

		if (number < 0) {
			System.out.println("Number should be > 0");
		} else {
			for (int counter = 1; counter <= number; counter++) {
				factorial = factorial * counter;
			}
			System.out.println("Factorial of " + number + " is " + factorial);
		}

	}

	public static void main(String[] args) throws Exception {
		System.out.println("Enter a number to calculate it's factorial");
		Scanner scanner = new Scanner(System.in);
		factorial(scanner.nextInt());
		scanner.close();
	}
}
