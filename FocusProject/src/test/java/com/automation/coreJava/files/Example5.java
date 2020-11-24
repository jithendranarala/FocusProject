package com.automation.coreJava.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.automation.selenium.utils.ApplicationConstants;

public class Example5 {

	public static void readAndWriteFile() {
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileInputStream = new FileInputStream(ApplicationConstants.inFilePath);
			fileOutputStream = new FileOutputStream(ApplicationConstants.outFilePath,true);
			int text = fileInputStream.read();
			while (text != -1) {
				System.out.print((char) text);
				fileOutputStream.write((char) text);
				text = fileInputStream.read();
			}
			fileInputStream.close();
			fileOutputStream.close();
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

	public static void main(String[] args) {
		readAndWriteFile();
	}

}
