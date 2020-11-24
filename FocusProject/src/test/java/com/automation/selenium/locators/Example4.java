package com.automation.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* Example to show how to use findElementByXPath()method */
public class Example4 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",  ApplicationConstants.CHROME_DRIVER_PATH);

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.redbus.in/");
		
		WebElement btnCheckAvailability =  driver.findElement(By.xpath("//*[text()='Search Buses']"));
		
		highlightObject(driver, btnCheckAvailability);
		
		Thread.sleep(5000);
		
		driver.quit();

	}
	public static void highlightObject(WebDriver driver,WebElement webElement) throws InterruptedException{
        JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
        for (int count = 1; count <= 1; count++) {
            jsExecutor.executeScript("arguments[0].style.border='14px groove red'", webElement);
            Thread.sleep(1000);
            jsExecutor.executeScript("arguments[0].style.border=''", webElement);
        }
    }

}
