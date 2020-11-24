package com.automation.coreJava.ultimate;

/* final @Variable level if you uncomment 11 th line it will give error message */
public class Example1 {

	private final double PI = 3.14;

	public static void main(String[] args) {
		Example1 example1 = new Example1();
		System.out.println(example1.PI);
		//example1.PI = 3.15;

	}

}
