package com.automation.selenium.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* Example to show how to retrieve value from application and validate with expected value */
public class Example6 {

	public static void main(String[] args) throws Exception {
		
		String expectedText = "FROM";
		
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.redbus.in/");
		
		String actualText = driver.findElement(By.xpath("//*[@for='src']")).getText();
		
		if (actualText.equals(expectedText)) {
			System.out.println("PASS:" + actualText + ":" + expectedText);
		} else {
			System.out.println("FAIL:" + actualText + ":" + expectedText);
		}
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
