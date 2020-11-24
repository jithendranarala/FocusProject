package com.automation.coreJava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example8 {

	public static void main(String[] args) {
		
		/*Create ArrayList object */
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1111, "RAMKI", "CTS");
		Employee e2 = new Employee(1112, "KIRAN", "CTS");
		Employee e3 = new Employee(1113, "SCOTT", "CTS");
		Employee e4 = new Employee(1114, "TIGER", "CTS");

		/* How to add objects to ArrayList */
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		System.out.println("Level 1:" + empList);
		
		empList.get(0).displayEmpInfo();
		empList.get(1).displayEmpInfo();
		empList.get(2).displayEmpInfo();
		empList.get(3).displayEmpInfo();

		/*Retrieve all objects from  ArrayList  using iterator*/
		Iterator<Employee> iterator = empList.iterator();
		while (iterator.hasNext()) {
			iterator.next().displayEmpInfo();
		}

		/*Retrieve all objects from  ArrayList  using ListIterator*/
		System.out.println("------------------>");
		ListIterator<Employee> listIterator = empList.listIterator();
		while (listIterator.hasNext()) {
			listIterator.next().displayEmpInfo();
		}
		
		/*Retrieve all objects from  ArrayList  using ListIterator*/
		System.out.println("<------------------");
		while (listIterator.hasPrevious()) {
			listIterator.previous().displayEmpInfo();
		}
	}

}
