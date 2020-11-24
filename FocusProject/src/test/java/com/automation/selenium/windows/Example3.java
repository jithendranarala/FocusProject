package com.automation.selenium.windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to use switchToWindow method*/
public class Example3 {

	@Test
	public void test() throws Exception {
		
		WebDriver driver = DriverHelper.getDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("http://www.ghmc.gov.in");
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles.size());
		
		Object[] windows = windowHandles.toArray();
		
		driver.switchTo().window(windows[1].toString());
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(windows[0].toString());
		
		WebElement element = driver.findElement(By.linkText("Know your LRS Status 2015"));
		
		DriverHelper.highlightObject(driver, element);
		
		element.click();
		
		Thread.sleep(10000);
		
		windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles.size());
		
		windows = windowHandles.toArray();
		
		driver.switchTo().window(windows[1].toString());
		
		WebElement webElement = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		DriverHelper.highlightObject(driver, webElement);
		
		Thread.sleep(2000);
		
		webElement = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		DriverHelper.highlightObject(driver, webElement);
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(windows[0].toString());
		
		Thread.sleep(2000);
		
		driver.close();
				
	}
	
}
