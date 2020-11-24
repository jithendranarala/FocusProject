package com.automation.selenium.drivers;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

/* This example show how to open Opera browser and navigate required URL and then close browser*/
public class Example4 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.opera.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "operadriver.exe");
		
		WebDriver driver = new OperaDriver();

		driver.get("https://www.honda2wheelersindia.com/");
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
