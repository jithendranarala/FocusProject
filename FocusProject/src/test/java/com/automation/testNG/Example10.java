package com.automation.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class Example10 {

	private WebDriver driver = null;

	@BeforeGroups(groups="Regression")
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		driver.get("https://www.applypanonline.com/new-pan-card-applicationform.php");
	}
		
	@Test(groups="Regression")
	public void regressionFunctionality() {
		System.out.println("regressionFunctionality");
	}
	
	@Test(groups="Smoke")
	public void smokeFunctionality() {
		System.out.println("smokeFunctionality");
	}

	@AfterGroups(groups="Regression")
	public void afterTest() {
		driver.quit();
	}

}
