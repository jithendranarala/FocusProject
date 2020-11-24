package com.automation.selenium.browser;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show how to maximize browser */
public class Example3 {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.ghmc.gov.in/");
		
		Thread.sleep(2000);
		
		Options options = driver.manage();
		
		Window window = options.window();
		
		window.maximize();
		
		driver.quit();

	}

}
