package com.automation.selenium.checkBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This Example show how to check the checkbox and how to use isSelected() method*/
public class Example1 {

	@Test
	public void testMethod() {

		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER_PATH);

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("http://www.applypanonline.com/new-pan-card-applicationform.php");

			Thread.sleep(2000);

			WebElement noIncome = driver.findElement(By.id("chkincome"));

			System.out.println("Before (isSelected Method):" + noIncome.isSelected());

			noIncome.click();

			Thread.sleep(2000);

			System.out.println("After (isSelected Method):"	+ noIncome.isSelected());

			Thread.sleep(1000);
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}

	}
}
