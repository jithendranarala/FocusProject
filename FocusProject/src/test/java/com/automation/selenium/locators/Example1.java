package com.automation.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* How to use findElementById,findElementByName,findElementByXPath(),findElementByLinkText() method*/
public class Example1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",  ApplicationConstants.CHROME_DRIVER_PATH);

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.applypanonline.com");
		
		WebElement linkApplyPan = driver.findElement(By.linkText("Apply for New PAN"));
		
		highlightObject(driver, linkApplyPan);
		
		linkApplyPan.click();
		
		WebElement txtFirstName =  driver.findElement(By.id("firstnameupp"));
		
		highlightObject(driver, txtFirstName);
		
		WebElement txtLastName = driver.findElement(By.name("lastname"));
		
		highlightObject(driver, txtLastName);
		
		WebElement txtMiddleName = driver.findElement(By.xpath("//input[@id = 'middlenameupp']"));
		
		highlightObject(driver, txtMiddleName);
		
		driver.quit();

	}
	public static void highlightObject(WebDriver driver,WebElement webElement) throws InterruptedException{
        JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
        for (int count = 1; count < 2; count++) {
            jsExecutor.executeScript("arguments[0].style.border='4px groove red'", webElement);
            Thread.sleep(1000);
            jsExecutor.executeScript("arguments[0].style.border=''", webElement);
        }
    }

}
