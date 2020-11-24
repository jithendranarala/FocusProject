package com.automation.selenium.list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This Example show how to select item from drop down using selectByVisibleText*/

public class Example3 {

	@Test
	public void createPAN() {

		WebDriver driver = null;
		try {

			Select select = null;

			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER_PATH);

			driver = new ChromeDriver();

			driver.get("http://www.applypanonline.com");

			driver.manage().window().maximize();

			driver.findElement(By.linkText("Apply for New PAN")).click();

			WebElement addressProof = driver.findElement(By.id("proofofresidence"));

			select = new Select(addressProof);

			select.selectByVisibleText("Water Bill");

			Thread.sleep(2000);
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		}finally{
			driver.quit();	
		}

		

	}
}
