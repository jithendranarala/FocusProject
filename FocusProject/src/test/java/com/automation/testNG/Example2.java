package com.automation.testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class Example2 {
	
	private WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest(){
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
	}

	@Test
	public void loginAndVerifyTitle() {
		String expectedTitle = "Find a Flight: Mercury Tours:";
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		String actualTitle = driver.getTitle().trim();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Actual Title is same as Expected Title");
		} else {
			System.out.println("Actual Title is not same as Expected Title");
		}
	}
	
	@AfterTest
	public void afterTest(){
		driver.quit();
	}
	

}
