package com.automation.testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class Example11 {

	private WebDriver driver = null;

	@BeforeGroups(groups = "Smoke")
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@Test(groups = "Regression")
	public void regressionFunctionality() {
		System.out.println("regressionFunctionality");
	}

	@Test(groups = "Smoke")
	public void smokeFunctionality() {
		System.out.println("smokeFunctionality");
	}

	@AfterGroups(groups = "Smoke")
	public void afterTest() {
		driver.quit();
	}

}
