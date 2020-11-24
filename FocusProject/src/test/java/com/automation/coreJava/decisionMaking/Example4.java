package com.automation.coreJava.decisionMaking;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/* Example to show how to use if else if conditional statement */
public class Example4 {

	public static void main(String[] args) throws Exception{

		String browserName = "IE";
		WebDriver driver = null;
		
		if(browserName.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get("http://www.applypanonline.com");
		Thread.sleep(2000);
		driver.close();
	}

}
