package com.automation.selenium.jsAlerts;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This Example show how to use switchToAlert method*/

public class Example1 {

	@Test
	public void test() {

		WebDriver driver = null;

		try {

			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER_PATH);

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			driver.get(ApplicationConstants.RESOURCES_PATH + "alerts" + File.separator + "SimpleAlert.html");

			WebElement button = driver.findElement(By.xpath("//*[text()='Click on me']"));

			button.click();

			Thread.sleep(2000);

			Alert alert = driver.switchTo().alert();

			alert.accept();

			Thread.sleep(1000);
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
