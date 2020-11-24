package com.automation.selenium.tables;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/* This Example show how to intract with Grid*/
public class Example3 {

WebDriver driver = null;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources"	+ File.separator + "drivers" + File.separator + "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void datePicker() throws Exception {
		driver.get("http://www.apsrtconline.in/oprs-web/");
		driver.findElement(By.xpath("//*[@value='Depart On']")).click();		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='10'])[1]")).click();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
}
