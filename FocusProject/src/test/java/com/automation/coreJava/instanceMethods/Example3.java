package com.automation.coreJava.instanceMethods;

import java.util.Scanner;

/* This Example is used to check whether the given number is even or odd */
public class Example3 {

	public void checkEvenAndOdd(){
		
		int number;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter input number");
		System.out.println("-1 indicates terminates from program");
		number = scanner.nextInt();
		
		while(number!=-1){
			if (number % 2 == 0) {
				System.out.println("Given Number '" + number + "' is an even number");
			} else {
				System.out.println("Given Number '" + number + "' is an add number");
			}
			System.out.println("Please enter input number");
			number = scanner.nextInt();
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		Example3 example3 = new Example3();
		example3.checkEvenAndOdd();
		
	}

}
