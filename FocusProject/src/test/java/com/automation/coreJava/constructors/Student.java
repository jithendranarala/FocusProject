package com.automation.coreJava.constructors;

/* This example show how to write class and create object */
public class Student {

	private int studentID;
	private String studentName;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public static void displayStudInfo(Student student) {
		System.out.print("Student ID:" + student.studentID + "\t");
		System.out.println("Student Name:" + student.studentName);
	}

	public static void main(String args[]) {
		Student s1 = new Student(1111,"SCOTT");
		Student.displayStudInfo(s1);
		Student s2 = new Student(1112,"TIGER");
		Student.displayStudInfo(s2);
		Student s3 = new Student(1113, "RAMKI");
		Student.displayStudInfo(s3);
		Student s4 = new Student(1114, "KIRAN");
		Student.displayStudInfo(s4);

	}

}
