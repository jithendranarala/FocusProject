package com.automation.selenium.radioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* Example to show how to retrieve value from application and validate with expected value */
public class Example3 {

	@Test
	public void createNewPAN() {
		WebDriver driver = null;
		try {

			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER_PATH);

			driver = new ChromeDriver();

			driver.get("https://www.cleartrip.com/");

			boolean actualState = driver.findElement(By.id("OneWay")).isSelected();

			Assert.assertEquals(actualState, true);

			driver.findElement(By.id("OneWay")).click();

			Thread.sleep(1000);

			driver.findElement(By.id("RoundTrip")).click();

			Thread.sleep(1000);

			driver.findElement(By.id("MultiCity")).click();
			
			Thread.sleep(1000);

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		}finally{
			driver.quit();
		}

	}

}
