package com.automation.coreJava.classesAndObjects;

/* This example show how to write class and create object */
public class Employee {

	private int empID = 9999;

	private String empName = "SCOTT";

	public void displayInfomation() {
		System.out.println("EMPID:" + empID);
		System.out.println("EMPName:" + empName);
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.displayInfomation();
	}

}
