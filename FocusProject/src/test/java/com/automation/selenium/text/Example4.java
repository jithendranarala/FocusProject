package com.automation.selenium.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* Example to show how to retrieve place holder and validate with expected value */
public class Example4 {

	public static void main(String[] args) throws Exception {
		
		String expectedText = "First Name";
		
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.applypanonline.com/");
		
		driver.findElement(By.linkText("Apply for New PAN")).click();
		
		String actualText = driver.findElement(By.id("firstnameupp")).getAttribute("placeholder");
		
		if (actualText.equals(expectedText)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}		
		
		Thread.sleep(2000);
		
		driver.quit();

	}
	
}
