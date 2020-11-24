package com.automation.selenium.sync;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class Example7 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void waitUntilTextFieldEnabled() throws Exception {
		driver.get(System.getProperty("user.dir") + File.separator + "resources" + File.separator  + "sync" + File.separator +"WaitUntilTextFieldEnabled.html");
		driver.findElement(By.id("firstName")).sendKeys("SCOTT");
		driver.findElement(By.id("lastName")).sendKeys("TIGER");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
