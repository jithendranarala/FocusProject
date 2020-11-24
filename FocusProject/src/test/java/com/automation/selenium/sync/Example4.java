package com.automation.selenium.sync;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This Example show how to use visibilityOfElementLocated()*/
public class Example4 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void waitUntilTextFieldIsDisplayed() throws Exception {
		driver.get(System.getProperty("user.dir") + File.separator + "resources" + File.separator  + "sync" + File.separator +"WaitUntilTextFieldDisplayed.html");
		driver.findElement(By.id("firstName")).sendKeys("SCOTT");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
		driver.findElement(By.id("lastName")).sendKeys("TIGER");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
