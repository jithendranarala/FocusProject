package com.automation.selenium.drivers;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example2 {
	
	/* This example show how to open firefox browser and navigate required URL  and then close browser*/

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.applypanonline.com/");
		
		driver.quit();

	}

}
