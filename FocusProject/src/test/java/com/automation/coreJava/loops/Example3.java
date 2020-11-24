package com.automation.coreJava.loops;

import java.util.Scanner;

/* Example to show how to use for statement */
/* Sum from start number to end Number */
public class Example3 {

	public static void main(String[] args) throws Exception {

		int startNumber;
		int endNumber;
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Start Number:");
		startNumber = scanner.nextInt();

		System.out.println("Enter End Number:");
		endNumber = scanner.nextInt();
		scanner.close();

		for (int counter = startNumber; counter <= endNumber; counter++) {
			sum = sum + counter;
		}

		System.out.println("Sum from " + startNumber + " to " + endNumber + " is :" + sum);
	}

}
