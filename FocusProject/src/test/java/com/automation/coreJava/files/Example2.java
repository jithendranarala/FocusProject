package com.automation.coreJava.files;

import java.io.FileOutputStream;

import com.automation.selenium.utils.ApplicationConstants;

public class Example2 {

	private static void writeFile() {
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(ApplicationConstants.outFilePath);
			String textMessage = "Below is where you can find the latest releases of all the Selenium components. You can also find a list of previous releases, source code, and additional information for Maven users (Maven is a popular Java build tool).";
			fileOutputStream.write(textMessage.getBytes());
			fileOutputStream.close();
			System.out.println("Created output file sucessfully location is :"+ ApplicationConstants.outFilePath);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

	public static void main(String[] args) {
		writeFile();
	}

}
