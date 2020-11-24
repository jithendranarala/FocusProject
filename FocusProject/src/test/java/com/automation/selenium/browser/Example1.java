package com.automation.selenium.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show how to maximize browser */
public class Example1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.applypanonline.com/");
		
		driver.manage().window().maximize();
		
		driver.quit();

	}
	
	

}
