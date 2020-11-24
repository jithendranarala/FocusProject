package com.automation.frameworks.testScripts.dataDriven;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.frameworks.core.FrameworkScript;

public class TC01_HomeInsurance_Structure extends FrameworkScript {

	@Test
	public void createHomeInsurance() {
		try {
			
			driver.get("https://www.policybazaar.com/");
			
			driver.findElement(By.xpath("//*[text()='Home']")).click();

			driver.findElement(By.xpath("//*[text()=' Rented ']")).click();

			driver.findElement(By.id("ddlPropertyAge")).sendKeys(testData("AgeOfTheProperty"));

			driver.findElement(By.xpath("//*[text()=' Flat / Apartment ']")).click();

			driver.findElement(By.xpath("//*[@for='rdStruct']")).click();

			Thread.sleep(2000);
			
			driver.findElement(By.id("next_1")).click();

			driver.findElement(By.id("ddlStructureCover")).sendKeys(testData("SumInsured"));
			
			Thread.sleep(2000);

			driver.findElement(By.id("next_2")).click();

			driver.findElement(By.id("txtName")).sendKeys(testData("Name"));

			driver.findElement(By.xpath("//*[@for='rdMale']")).click();

			driver.findElement(By.xpath("//*[@for='rdMarried']")).click();

			driver.findElement(By.id("MainContent_BookingEngineNew_ucDateOfBirth_drpDay")).sendKeys(testData("Date"));

			driver.findElement(By.id("MainContent_BookingEngineNew_ucDateOfBirth_drpMonth")).sendKeys(testData("Month"));

			driver.findElement(By.id("MainContent_BookingEngineNew_ucDateOfBirth_drpYear")).sendKeys(testData("Year"));

			driver.findElement(By.id("ddlAnnualIncome")).sendKeys(testData("AnnualIncome"));

			driver.findElement(By.id("txtEmail")).sendKeys(testData("Email"));

			driver.findElement(By.id("txtMobile")).sendKeys(testData("Mobile"));
			
			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println(exception.toString());
		}
	}

	
}
