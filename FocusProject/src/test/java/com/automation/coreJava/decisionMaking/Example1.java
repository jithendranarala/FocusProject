package com.automation.coreJava.decisionMaking;

import java.util.Scanner;
/* Example to show how to use if-else condition */
public class Example1 {

	public static void main(String[] args) {

		int passMarks;

		int marksObtained;

		passMarks = 35;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter marks obtained by you");

		marksObtained = input.nextInt();

		if (marksObtained >= passMarks) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		input.close();
	}

}
