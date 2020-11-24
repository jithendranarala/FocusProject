package com.automation.selenium.text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* Example to show how to use findElementByLinkText,findElementById,findElementByName ,findElementByXPath() and senKeys method*/
public class Example2 {

	public static void main(String args[])throws Exception{
		
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://www.applypanonline.com");
		
		driver.findElement(By.linkText("Apply for New PAN")).click();
		
		driver.findElement(By.id("firstnameupp")).sendKeys("SCOTT");
		
		driver.findElement(By.name("lastnameupp")).sendKeys("TIGER");
		
		driver.findElement(By.xpath("//input[@id = 'middlenameupp']")).sendKeys("TROY");
				
		Thread.sleep(2000);
		
		driver.quit();

	}

}
