package com.automation.selenium.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show how to use back ,forward ,refresh and quit methods */
public class Example4 {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.applypanonline.com/");
		
		Thread.sleep(3000);
		
		Navigation navigation = driver.navigate();
		
		navigation.to("http://www.ghmc.gov.in/");
		
		Thread.sleep(3000);

		navigation.back();
		
		Thread.sleep(3000);
		
		navigation.forward();
		
		Thread.sleep(3000);
		
		navigation.refresh();
		
		Thread.sleep(3000);
		
		driver.quit();

	}
}
