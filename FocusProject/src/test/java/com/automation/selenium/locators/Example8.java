package com.automation.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;
import com.automation.selenium.utils.DriverHelper;

/* Example to show how to highlight object/webElement/htmlTag/HtmlControl*/
public class Example8 {
	
	public static void main(String[] args) throws Exception{

		WebElement webElement = null; 
		
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.applypanonline.com/new-pan-card-applicationform.php");
		
		driver.manage().window().maximize();
		
		webElement =  driver.findElement(By.xpath("(//*[@type='text'])[1]"));
		
		DriverHelper.highlightObject(driver,webElement);
		
		webElement =  driver.findElement(By.xpath("(//*[@type='text'])[2]"));
		
		DriverHelper.highlightObject(driver,webElement);
		
		webElement =  driver.findElement(By.xpath("(//*[@type='text'])[3]"));
		
		DriverHelper.highlightObject(driver,webElement);
		
		driver.quit();
	}


}
