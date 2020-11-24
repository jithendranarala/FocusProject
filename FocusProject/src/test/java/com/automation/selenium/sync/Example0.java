package com.automation.selenium.sync;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This Example show how to use WebDriverWait and ExpectedConditions*/

public class Example0 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void waitUntilAlertIsDisplayed() {
		driver.get(System.getProperty("user.dir") + File.separator + "resources" + File.separator  + "sync" + File.separator +"WaitUntilAlertDisplayed.html");
		WebElement button = driver.findElement(By.xpath("//*[text()='Click']"));
		button.click();
		Alert alert =  driver.switchTo().alert();
		System.out.println("Alert Text:" + alert.getText());
		alert.accept();
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
