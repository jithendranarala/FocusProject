package com.automation.testNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class Example6 {

	private WebDriver driver = null;

	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@Test(dependsOnMethods = "launchBrowser")
	public void login() {
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
	}

	@Test(dependsOnMethods = "login")
	public void verifyTitle() {
		String expectedTitle = "Find a Flight: Mercury Tours:";
		String actualTitle = driver.getTitle().trim();
		AssertJUnit.assertEquals(actualTitle, expectedTitle, "Title Varification");
	}

	@Test(dependsOnMethods = "verifyTitle")
	public void closeBrowser() {
		driver.close();
	}

}
