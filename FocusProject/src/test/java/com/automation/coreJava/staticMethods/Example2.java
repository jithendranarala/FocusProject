package com.automation.coreJava.staticMethods;

import java.util.Scanner;

/* Example to show how to use for statement */
/* Sum from start number to end Number */
public class Example2 {

	public static void sum(int startNumber, int endNumber) {
		int sum = 0;
		for (int counter = startNumber; counter <= endNumber; counter++) {
			sum = sum + counter;
		}
		System.out.println("Sum from " + startNumber + " to " + endNumber + " is :" + sum);
	}

	public static void main(String[] args) {
		int startNumber, endNumber;
		System.out.println("Enter Start Number:");
		Scanner scanner = new Scanner(System.in);
		startNumber = scanner.nextInt();
		System.out.println("Enter End Number:");
		endNumber = scanner.nextInt();
		scanner.close();
		Example2.sum(startNumber, endNumber);

	}

}
