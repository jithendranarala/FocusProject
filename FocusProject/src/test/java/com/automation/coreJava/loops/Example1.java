package com.automation.coreJava.loops;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Example to show how to use for statement */
public class Example1 {

	public static void main(String[] args) throws Exception{

		int numberOfIterations = 2;
		
		for (int index = 1; index <= numberOfIterations; index++) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.applypanonline.com");
			Thread.sleep(2000);
			driver.quit();
		}
	}

}
