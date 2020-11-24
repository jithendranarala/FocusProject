package com.automation.coreJava.inheritance;

public class Agression {

	public static void main(String[] args) {

		Address address = new Address("ROYAL", "MIG", "", "Hyderabad", "TS","5000081");
		Employee e1 = new Employee(1111, "SCOTT", "CTS", address);
		e1.displayInformation();
		Employee e2 = new Employee(1112, "TIGER", "CTS", address);
		e2.displayInformation();
	}

}
