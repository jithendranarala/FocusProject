package com.automation.coreJava.accessModifiers;

public class Example2 {

	public void displayInformation() {
		Example1 example1 = new Example1();
		//System.out.println(example1.privateVariable);
		System.out.println(example1.publicVariable);
		System.out.println(example1.protectedVariable);
		System.out.println(example1.defaultVariable);
	}

	public static void main(String[] args) {
		Example2 example2 = new Example2();
		example2.displayInformation();
	}

}
