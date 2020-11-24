package com.automation.coreJava.inheritance;

public class Employee {

	private int empID;

	private String empName;

	private String employeerName;

	private Address address;

	public Employee(int empID, String empName, String employeerName) {
		this.empID = empID;
		this.empName = empName;
		this.employeerName = employeerName;

	}

	public Employee(int empID, String empName, String employeerName,Address address) {
		this.empID = empID;
		this.empName = empName;
		this.employeerName = employeerName;
		this.address = address;
	}

	public void displayInformation() {
		System.out.print("EMP ID:" + empID + "\t");
		System.out.print("EMP NAME:" + empName + "\t");
		System.out.print("EMPLOYEER NAME"+ employeerName + "\t");
		address.display(address);
		
	}

}
