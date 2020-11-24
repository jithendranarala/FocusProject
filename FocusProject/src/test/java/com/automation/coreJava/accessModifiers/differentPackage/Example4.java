package com.automation.coreJava.accessModifiers.differentPackage;

import com.automation.coreJava.accessModifiers.Example1;

public class Example4 extends Example1 {

	public void displayInformation() {
		System.out.println(publicVariable);
		System.out.println(protectedVariable);
	}

	public static void main(String[] args) {
		Example4 example4 = new Example4();

	}

}
