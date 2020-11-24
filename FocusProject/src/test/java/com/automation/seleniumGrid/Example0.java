package com.automation.seleniumGrid;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example0 {

	@Test
	public void testMethod() {

		try {
			WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources"	+ File.separator + "drivers" + File.separator + "chromedriver.exe");
			
			driver = new ChromeDriver();

			driver.get("http://www.applypanonline.com");

			driver.findElement(By.linkText("Apply for New PAN")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("firstnameupp")).sendKeys("SCOTT");

			driver.findElement(By.id("lastnameupp")).sendKeys("TIGER");

			driver.findElement(By.xpath("//input[@id = 'middlenameupp']")).sendKeys("J");

			Thread.sleep(2000);

			driver.quit();
		} catch (Exception exception) {
			System.out.println(exception.toString());
		}

	}

}
