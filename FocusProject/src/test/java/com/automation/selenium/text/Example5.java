package com.automation.selenium.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* Example to show how to retrieve value from application  and validate with expected value */
public class Example5 {

	public static void main(String[] args) throws Exception {
		
		String expectedText = "From";
		
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.apsrtconline.in/oprs-web/");
		
		String actualText = driver.findElement(By.name("fromPlaceName")).getAttribute("value");
		
		if (actualText.equals(expectedText)) {
			System.out.println("PASS:" + actualText + ":" + expectedText);
		} else {
			System.out.println("FAIL:" + actualText + ":" + expectedText);
		}
		
		Thread.sleep(2000);
		
		driver.quit();

	}
	
}
