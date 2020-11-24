package com.automation.coreJava.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

public class Example6 {

	public static void main(String[] args) {

		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER_PATH);

			driver = new ChromeDriver();

			driver.get("http://www.applypanonline.com");

			driver.findElement(By.linkText("Apply for New PAN")).click();

			driver.findElement(By.id("firstnameuppp")).sendKeys("SCOTT");
		} catch (Exception exception) {
			new RootException(exception);
		} finally {
			driver.quit();
		}

	}

}
