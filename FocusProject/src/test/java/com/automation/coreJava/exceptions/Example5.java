package com.automation.coreJava.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

public class Example5 {

	public static void main(String[] args) {

		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER_PATH);

			driver = new ChromeDriver();

			driver.get("http://www.applypanonline.com");

			driver.findElement(By.linkText("Apply for New PAN")).click();
			
			Thread.sleep(5000);

			driver.findElement(By.id("firstnameupp")).sendKeys("SCOTT");
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		} finally {
			driver.quit();
		}

	}

}
