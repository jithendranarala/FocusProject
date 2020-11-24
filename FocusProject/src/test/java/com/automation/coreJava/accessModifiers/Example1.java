package com.automation.coreJava.accessModifiers;

public class Example1 {

	private String privateVariable = "Private";
	public String publicVariable = "Public";
	String defaultVariable = "Default";
	protected String protectedVariable = "Protected";

	public void displayInfomation() {
		System.out.println(privateVariable);
		System.out.println(publicVariable);
		System.out.println(protectedVariable);
		System.out.println(defaultVariable);
	}

	public static void main(String args[]) {
		Example1 example1 = new Example1();
		example1.displayInfomation();

	}

}
