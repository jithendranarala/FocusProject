package com.automation.coreJava.inheritance;

import io.appium.java_client.TouchAction;

@SuppressWarnings("unused")
public class Address {

	private String houseName;

	private String street;

	private String landMark;

	private String city;

	private String state;

	private String pinCode;

	public Address(String houseName, String street, String landMark,
			String city, String state, String pincode) {
		this.houseName = houseName;
		this.street = street;
		this.landMark = landMark;
		this.city = city;
		this.state = state;
		this.pinCode = pincode;

	}

	public void display() {
		System.out.print("HouseName:" + houseName + "\t");
		System.out.print("Street:" + street + "\t");
		System.out.print("City:" + city + "\t");
		System.out.print("State:" + state + "\t");
		System.out.println("PinCode:" + pinCode + "\t");
	}
	
	public void display(Address address) {
		System.out.print("HouseName:" + address.houseName + "\t");
		System.out.print("Street:" + street + "\t");
		System.out.print("City:" + city + "\t");
		System.out.print("State:" + state + "\t");
		System.out.println("PinCode:" + pinCode + "\t");
	}

}
