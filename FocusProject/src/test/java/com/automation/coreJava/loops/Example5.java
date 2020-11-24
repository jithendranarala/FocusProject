package com.automation.coreJava.loops;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Example to show how to use while statement */
public class Example5 {

	public static void main(String[] args) throws Exception{
		
		String browser = "CHROME";
		
		while(browser.equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.applypanonline.com");
			Thread.sleep(2000);
			driver.quit();
			browser="FF";
		}
	}

}
