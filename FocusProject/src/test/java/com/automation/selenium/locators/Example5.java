package com.automation.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* Example to show how to use findElementByXPath()method */
public class Example5 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",  ApplicationConstants.CHROME_DRIVER_PATH);

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.applypanonline.com/new-pan-card-applicationform.php");
		
		WebElement txtFirstName =  driver.findElement(By.xpath("//*[@id='lastnameupp']/preceding::input[@type='text']"));
		
		highlightObject(driver, txtFirstName);
		
		WebElement listMonth = driver.findElement(By.xpath("//*[@id='dd']/following-sibling::select"));
		
		highlightObject(driver, listMonth);
		
		WebElement textYear = driver.findElement(By.xpath("//*[@id='dd']/following-sibling::input"));
		
		highlightObject(driver, textYear);
		
		WebElement listDate = driver.findElement(By.xpath("//*[@id='mm']/preceding-sibling::select"));
		
		highlightObject(driver, listDate);
		
		driver.quit();

	}
	public static void highlightObject(WebDriver driver,WebElement webElement) throws InterruptedException{
        JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
        jsExecutor.executeScript("arguments[0].style.border='5px groove red'", webElement);
        Thread.sleep(1000);
        jsExecutor.executeScript("arguments[0].style.border=''", webElement);
    }

}
