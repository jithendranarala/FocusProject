package com.automation.selenium.text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* How to use getAttribute method*/
public class Example3 {

	@Test
	public void testMethod()throws Exception{
		
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://www.applypanonline.com");
		
		driver.findElement(By.linkText("Apply for New PAN")).click();
		
		driver.findElement(By.id("firstnameupp")).sendKeys("SCOTT");
				
		Thread.sleep(2000);
		
		System.out.println("Name on the PAN Card:" + driver.findElement(By.id("firstnameupp")).getAttribute("print_firstname"));
		
		driver.quit();

	}

}
