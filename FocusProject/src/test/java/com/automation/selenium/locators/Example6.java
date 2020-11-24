package com.automation.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* Example to show how to use findElementByXPath()method */
public class Example6 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",  ApplicationConstants.CHROME_DRIVER_PATH);

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.apsrtconline.in/oprs-web/");
		
		WebElement txtFrom =  driver.findElement(By.xpath("//*[@id='toPlaceName']/preceding::input[@type='text']"));
		
		highlightObject(driver, txtFrom);
		
		WebElement forRoundTrip = driver.findElement(By.xpath("//*[@id='txtJourneyDate']/following-sibling::input[@type='text']"));
		
		highlightObject(driver, forRoundTrip);
		
		WebElement btnCheckAvailablity = driver.findElement(By.xpath("//*[@id='txtJourneyDate']/following-sibling::input[@type='button']"));
		
		highlightObject(driver, btnCheckAvailablity);
		
		driver.quit();

	}
	public static void highlightObject(WebDriver driver,WebElement webElement) throws InterruptedException{
        JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
        jsExecutor.executeScript("arguments[0].style.border='5px groove red'", webElement);
        Thread.sleep(1000);
        jsExecutor.executeScript("arguments[0].style.border=''", webElement);
    }

}
