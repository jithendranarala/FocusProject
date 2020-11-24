package com.automation.coreJava.variables;

/* This example show how to declare primitive data types and non primitive data types*/
public class Example2 {

	public static void main(String[] args) {

		/* Primitive Data types*/
		int empID = 1199;

		double empSalary = 75000;
		
		char empGender = 'M';
		
		System.out.println("EMPID:"+empID);
		
		System.out.println("EMPSALARY:"+empSalary);
		
		System.out.println("EMPGENDER:"+empGender);
		
		/*auto boxing */
		Integer objEmpID = empID;
		
		Double objEmpSalary = empSalary;
		
		Character objEmpGender = empGender;
		
		System.out.println("EMPID:"+objEmpID);
		
		System.out.println("EMPSALARY:"+objEmpSalary);
		
		System.out.println("EMPGENDER:"+objEmpGender);
		
		/*Unboxing */
		
		empID = objEmpID;
		
		empSalary = objEmpSalary;
		
		empGender = objEmpGender;

		System.out.println("EMPID:"+empID);
		
		System.out.println("EMPSALARY:"+empSalary);
		
		System.out.println("EMPGENDER:"+empGender);
	}

}
