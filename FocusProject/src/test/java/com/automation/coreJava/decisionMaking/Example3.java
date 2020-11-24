package com.automation.coreJava.decisionMaking;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Example to show how to use if conditional statement */
public class Example3 {

	public static void main(String[] args) throws Exception{

		String browserName = "CHROME";
		
		WebDriver driver = null;
		
		if(browserName.equalsIgnoreCase("CHROME")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("http://www.applypanonline.com");
			
			Thread.sleep(2000);
			
			driver.close();
		}
		
	}

}
