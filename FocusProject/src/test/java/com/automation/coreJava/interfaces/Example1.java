package com.automation.coreJava.interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.automation.selenium.utils.ApplicationConstants;

@SuppressWarnings("unused")
public class Example1 {
	
	public void test(String browserName){
		
		ChromeDriver driver = null;
		
		if(browserName.equalsIgnoreCase("CHROME")){
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
			//FirefoxDriver driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
			//InternetExplorerDriver driver = new InternetExplorerDriver();
		}
		driver.get("http://www.applypanonline.com/");
		driver.quit();
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.test("CC");
	}

}
