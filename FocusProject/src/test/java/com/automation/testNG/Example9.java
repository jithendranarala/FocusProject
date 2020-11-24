package com.automation.testNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class Example9 {

	private WebDriver driver = null;

	@BeforeTest
	@Parameters({ "browser" })
	public void beforeTest(String browser) {
		switch (browser.toUpperCase()) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			break;
		case "FF":
			System.setProperty("webdriver.gecko.driver", ApplicationConstants.FIREFOX_DRIVER_PATH);
			driver = new FirefoxDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", ApplicationConstants.IE_DRIVER_PATH);
			driver = new InternetExplorerDriver();
			break;
		}
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
