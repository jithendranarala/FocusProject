package com.automation.coreJava.loops;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Example to show how to use do while statement */
public class Example6 {

	public static void main(String[] args) throws Exception{
		
		String browser = "FF";
		do {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.applypanonline.com");
			Thread.sleep(2000);
			driver.quit();
		}while(browser.equals("CHROME"));
	}

}
