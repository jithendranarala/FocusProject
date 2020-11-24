package com.automation.selenium.drivers;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

/* This example show how to open Safari browser and navigate required URL and then close browser*/
public class Example5 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.safari.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "safaridriver.exe");
		
		WebDriver driver = new SafariDriver();

		driver.get("http://newtours.demoaut.com/");
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
