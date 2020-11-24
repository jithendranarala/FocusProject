package com.automation.frameworks.testScripts.linear;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_HomeInsurance_Structure {

	@Test
	public void createHomeInsurance() {
		
		WebDriver driver = null;
		
		try {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers"	+ File.separator + "chromedriver.exe");
			
			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			driver.get("https://www.policybazaar.com/");
			
			driver.findElement(By.xpath("//*[text()='Home']")).click();

			driver.findElement(By.xpath("//*[text()=' Rented ']")).click();

			driver.findElement(By.id("ddlPropertyAge")).sendKeys("Upto 30 years");

			driver.findElement(By.xpath("//*[text()=' Flat / Apartment ']")).click();

			driver.findElement(By.xpath("//*[@for='rdStruct']")).click();
			
			driver.findElement(By.id("next_1")).click();
			
			Thread.sleep(2000);

			driver.findElement(By.id("ddlStructureCover")).sendKeys("50,00,000");
			
			driver.findElement(By.id("next_2")).click();
			
			Thread.sleep(2000);

			driver.findElement(By.id("txtName")).sendKeys("SCOTT");

			driver.findElement(By.xpath("//*[@for='rdMale']")).click();

			driver.findElement(By.xpath("//*[@for='rdMarried']")).click();

			driver.findElement(By.id("MainContent_BookingEngineNew_ucDateOfBirth_drpDay")).sendKeys("11");

			driver.findElement(By.id("MainContent_BookingEngineNew_ucDateOfBirth_drpMonth")).sendKeys("Aug");

			driver.findElement(By.id("MainContent_BookingEngineNew_ucDateOfBirth_drpYear")).sendKeys("1985");

			driver.findElement(By.id("ddlAnnualIncome")).sendKeys("10-15 Lakhs");

			driver.findElement(By.id("txtEmail")).sendKeys("scott@scott.com");

			driver.findElement(By.id("txtMobile")).sendKeys("9112345678");

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println(exception.toString());
		} finally {
			driver.close();
		}
	}
}
