package com.automation.coreJava.variables;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/* Example to show how to use arrays */
public class Example6 {

	public static void main(String[] args) throws Exception{
		
		String[] browserName = {"CHROME","FF","IE"};
		
		WebDriver driver = null;
		
		for(String browser:browserName){
			switch (browser) {
				case "CHROME":
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver.exe");
					driver = new ChromeDriver();
					break;
				case "FF":
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "geckodriver.exe");
					driver = new FirefoxDriver();
					break;
				case "IE":
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "IEDriverServer.exe");
					driver = new InternetExplorerDriver();
					break;
			}
			driver.get("http://www.applypanonline.com");
			Thread.sleep(2000);
			driver.quit();
			}
	}

}
