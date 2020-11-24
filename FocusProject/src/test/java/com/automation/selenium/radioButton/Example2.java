package com.automation.selenium.radioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* Example to show how to retrieve value from application and validate with expected value */
public class Example2 {

	public void createNewPAN() {

		try {
			boolean expectedState = true;

			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER_PATH);

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.cleartrip.com/");

			boolean actualState = driver.findElement(By.id("OneWay")).isSelected();

			if (actualState == expectedState) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}

			driver.findElement(By.id("OneWay")).click();

			Thread.sleep(1000);

			driver.findElement(By.id("RoundTrip")).click();

			Thread.sleep(1000);

			driver.findElement(By.id("MultiCity")).click();
			
			Thread.sleep(1000);

			driver.close();
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		}

	}

	public static void main(String[] args) {
		Example2 example2 = new Example2();
		example2.createNewPAN();
	}

}
