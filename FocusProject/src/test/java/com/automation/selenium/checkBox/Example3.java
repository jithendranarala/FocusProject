package com.automation.selenium.checkBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This Example show how to use Assertions in TestNG*/
public class Example3 {

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

			Assert.assertEquals(noIncome.isSelected(), false);

			noIncome.click();

			Thread.sleep(2000);
			
			Assert.assertEquals(noIncome.isSelected(), true);

			Thread.sleep(1000);
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}

	}
}
