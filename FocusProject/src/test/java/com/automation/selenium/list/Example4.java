package com.automation.selenium.list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This Example show how to select item from drop down using selectByValue*/

public class Example4 {

	@Test
	public void createPAN() throws Exception {

		WebDriver driver = null;
		
		Select select = null;

		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);

		driver = new ChromeDriver();
		
		driver.get("http://www.applypanonline.com");

		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Apply for New PAN")).click();

		WebElement dateOfBirth = driver.findElement(By.id("dobproof"));
		
		select = new Select(dateOfBirth);
		
		select.selectByValue("8");
		
		Thread.sleep(2000);

		driver.quit();

	}
}
