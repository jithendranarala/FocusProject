package com.automation.selenium.sync;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;


public class Example5 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void waitUntilButtonToBeClickable() throws Exception {
		driver.get(System.getProperty("user.dir") + File.separator + "resources" + File.separator  + "sync" + File.separator +"WaitUntilButtonEnabled.html");
		WebElement button = driver.findElement(By.xpath("//*[@value='Search']"));
		button.click();
		String actualMessage = driver.findElement(By.id("displayMessage")).getText();
		if((actualMessage.equals(null)) |(actualMessage.equals(""))){
			System.out.println("FAIL");
		}else{
			System.out.println("PASS");
		}
		Thread.sleep(1000);
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
