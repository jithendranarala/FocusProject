package com.automation.selenium.drivers;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/* This example show how to open internet Explorer browser and navigate required URL and then close browser*/
public class Example3 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();

		driver.get("http://newtours.demoaut.com/");
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
