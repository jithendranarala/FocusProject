package com.automation.testNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class Example3 {

	private WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
	}

	@Test
	public void loginAndVerifyTitle() {
		String expectedTitle = "Find a Flight: Mercury Tours:";
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		String actualTitle = driver.getTitle().trim();
		AssertJUnit.assertEquals(actualTitle, expectedTitle, "Title Varification");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
