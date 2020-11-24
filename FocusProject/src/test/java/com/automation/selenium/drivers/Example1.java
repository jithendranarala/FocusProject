package com.automation.selenium.drivers;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* This example show how to open chrome browser and navigate required URL  and then close browser*/
public class Example1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
