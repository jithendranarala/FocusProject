package com.automation.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class Example8 {

	private WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		driver.get("https://www.applypanonline.com/new-pan-card-applicationform.php");
	}

	@Test(timeOut = 5)
	public void testTimeout() throws Exception {
		try{
			System.out.println("testTimeout");
			Thread.sleep(10000);	
		}catch(Exception exception){
			System.out.println(exception.getMessage());
		}
	}

	@Test(enabled = false)
	public void testEnabledAttribute() {
		System.out.println("testEnabledAttribute");
	}

	@Test(invocationCount = 5)
	public void testInvocationCount() {
		System.out.println("testInvocationCount");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
