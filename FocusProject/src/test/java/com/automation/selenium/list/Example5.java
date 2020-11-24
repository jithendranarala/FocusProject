package com.automation.selenium.list;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This Example show how to retrieve selected item from drop down and then Validate with expected*/
public class Example5 {

	@Test
	public void createPAN() throws Exception {

		WebDriver driver = null;
		
		Select select = null;

		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);

		driver = new ChromeDriver();
		
		driver.get("http://www.applypanonline.com");

		driver.findElement(By.linkText("Apply for New PAN")).click();
		
		WebElement day = driver.findElement(By.id("dd"));

		select = new Select(day);

		select.selectByVisibleText("17");
		
		select.selectByVisibleText("18");
		
		Assert.assertEquals(select.getFirstSelectedOption().getText(), "18");

		WebElement month = driver.findElement(By.id("mm"));

		select = new Select(month);

		select.selectByVisibleText("DEC");

		Assert.assertEquals(select.getFirstSelectedOption().getText(), "DEC");

		Thread.sleep(2000);

		driver.quit();

	}

}
