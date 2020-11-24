package com.automation.coreJava.exceptions;

@SuppressWarnings("serial")
public class RootException extends Exception {

	public RootException(Exception exception) {
		System.out.println("RootException:" + exception.toString());
		System.out.println("RootException:" + exception.getMessage());
	}

}
