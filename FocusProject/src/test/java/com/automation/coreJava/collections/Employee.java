package com.automation.coreJava.collections;

public class Employee {
	
	private int empID;
	private String empName;
	private String employeerName;
	
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmployeerName() {
		return employeerName;
	}

	public void setEmployeerName(String employeerName) {
		this.employeerName = employeerName;
	}
	
	
	public Employee(int empID,String empName,String employeerName){
		this.empID = empID;
		this.empName = empName;
		this.employeerName = employeerName;
	}
	
	public Employee(int empID,String empName){
		this.empID = empID;
		this.empName = empName;
		this.employeerName = "CTS";
	}
	
	public void displayEmpInfo(){
		System.out.println("Employee Details:" + empID + "\t" + empName + "\t"	+ employeerName);
	}

}
