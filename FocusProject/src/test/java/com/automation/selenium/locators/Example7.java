package com.automation.selenium.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;
import com.automation.selenium.utils.DriverHelper;

/* Example to show how to use findElements()method */

public class Example7 {

	public static void main(String[] args) throws Exception {

		List<WebElement> webElements = null;
		
		System.setProperty("webdriver.chrome.driver",  ApplicationConstants.CHROME_DRIVER_PATH);

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.applypanonline.com/new-pan-card-applicationform.php");

		webElements = driver.findElements(By.tagName("a"));

		System.out.println("WebElements Count:" + webElements.size());

		for (WebElement webElement : webElements) {
			DriverHelper.highlightObject(driver, webElement);
		}

		Thread.sleep(2000);
		
		webElements = driver.findElements(By.tagName("select"));

		System.out.println("WebElements Count:" + webElements.size());

		for (WebElement webElement : webElements) {
			DriverHelper.highlightObject(driver, webElement);
		}

		Thread.sleep(2000);

		driver.quit();

	}

}

