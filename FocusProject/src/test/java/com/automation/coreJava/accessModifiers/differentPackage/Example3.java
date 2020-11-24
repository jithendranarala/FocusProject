package com.automation.coreJava.accessModifiers.differentPackage;

import com.automation.coreJava.accessModifiers.Example1;

public class Example3 {

	public void displayInformation() {
		Example1 example1 = new Example1();
		// System.out.println(example1.privateVariable);
		System.out.println(example1.publicVariable);
		// System.out.println(example1.protectedVariable);
		// System.out.println(example1.defaultVariable);
	}

	public static void main(String[] args) {
		Example3 example3 = new Example3();
		example3.displayInformation();

	}

}
