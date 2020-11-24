package com.automation.testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class Example5 {

	private WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		driver.get("https://www.applypanonline.com/new-pan-card-applicationform.php");
	}

	@Test(priority=0)
	public void personalInformation() {
		driver.findElement(By.id("firstnameupp")).sendKeys("SCOTT");
	}
	
	@Test(priority=1)
	public void contactDetails() {
		driver.findElement(By.id("mobilenumber")).sendKeys("9112345678");
	}

	@Test(priority=2)
	public void documentProof() {
		driver.findElement(By.id("proofofidentity")).sendKeys("Passport");
	}
	
	@Test(priority=3)
	public void incomeSource() {
		driver.findElement(By.id("chksalary1")).click();
	}
	
	@Test(priority=4)
	public void addressInformation(){
		driver.findElement(By.id("flatroomnoresidence")).sendKeys("HYDERABAD");
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
