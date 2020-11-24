package com.automation.selenium.list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This Example show how to select item from drop down using sendKeys method*/
public class Example1 {

	@Test
	public void createPAN() {

		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER_PATH);

			driver = new ChromeDriver();

			driver.get("http://www.applypanonline.com");

			driver.manage().window().maximize();

			driver.findElement(By.linkText("Apply for New PAN")).click();

			WebElement idProof = driver.findElement(By.id("proofofidentity"));

			idProof.sendKeys("Passport");

			Thread.sleep(5000);
			
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}
}
