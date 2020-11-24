package com.automation.testNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class Example7 {

	private WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		driver.get("https://www.applypanonline.com/new-pan-card-applicationform.php");
	}

	@Test(priority=0)
	public void personalInformation() {
		boolean expectedStatus = driver.findElement(By.id("category10")).isSelected();
		boolean actualStatus = true;
		Assert.assertEquals(actualStatus, expectedStatus,"Default individual should be selected");
		WebElement listDD = driver.findElement(By.id("dd"));
		Select select = new Select(listDD);
		List<WebElement> listOptions = select.getOptions();
		int actualItemCount = listOptions.size();
		int expectedItemCount = 32;
		Assert.assertEquals(actualItemCount, expectedItemCount,"List should be displayed 32 items");
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
