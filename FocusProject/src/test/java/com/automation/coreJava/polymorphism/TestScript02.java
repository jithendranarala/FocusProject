package com.automation.coreJava.polymorphism;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.automation.coreJava.inheritance.FrameworkScript;

public class TestScript02 extends FrameworkScript {

	private WebDriver driver = null;

	public WebDriver launchBrowser(String browserName){
		
		switch (browserName.toUpperCase()) {
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
			case "SAFARI":
				System.setProperty("webdriver.safari.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "safaridriver.exe");
				driver = new SafariDriver();
				break;	
		}
		return driver;
	}

	public void createAccount() {
		driver = launchBrowser("CHROME");
		driver.get("https://www.applypanonline.com/");
		driver.findElement(By.linkText("Apply for New PAN")).click();
		driver.findElement(By.id("firstnameupp")).sendKeys("SCOTT");
		driver.close();
	}

	public static void main(String[] args) {
		TestScript02 script02 = new TestScript02();
		script02.createAccount();
	}

}
