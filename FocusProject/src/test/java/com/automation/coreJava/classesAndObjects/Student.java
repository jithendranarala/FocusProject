package com.automation.coreJava.classesAndObjects;

/* This example show how to write class and create object */
public class Student {

	private int studentID;
	private String studentName;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public void displayStudInfo() {
		System.out.print("Student ID:" + studentID + "\t");
		System.out.println("Student Name:" + studentName);
	}

	public static void main(String args[]) {
		Student s1 = new Student(1111,"SCOTT");
		s1.displayStudInfo();
		Student s2 = new Student(1112,"TIGER");
		s2.displayStudInfo();
		Student s3 = new Student(1113, "RAMKI");
		s3.displayStudInfo();
		Student s4 = new Student(1114, "KIRAN");
		s4.displayStudInfo();

	}

}
