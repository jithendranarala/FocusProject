package com.automation.selenium.radioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This Example show how to select Radio Button and how to use isSelected() method*/
public class Example1 {

	@Test
	public void testMethod() {
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER_PATH);

			driver = new ChromeDriver();

			driver.get("http://www.applypanonline.com/new-pan-card-applicationform.php");

			WebElement individuals = driver.findElement(By.id("category10"));

			System.out.println("(isSelected Method):"+ individuals.isSelected());

			WebElement army = driver.findElement(By.id("category11"));

			System.out.println("Before (isSelected Method):" + army.isSelected());

			army.click();

			System.out.println("After (isSelected Method):" + army.isSelected());

			Thread.sleep(1000);

			WebElement navy = driver.findElement(By.id("category12"));

			System.out.println("Before (isSelected Method):"+ navy.isSelected());

			navy.click();

			System.out.println("After (isSelected Method):" + navy.isSelected());

			Thread.sleep(1000);
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		} finally {
			driver.quit();

		}

	}
}
