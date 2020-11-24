package com.automation.frameworks.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionsHelper {
	
	public static void yourHome(WebDriver driver,String ageOFProperty,String riskType) {
		try {
			driver.findElement(By.xpath("//*[text()='Home']")).click();
			
			driver.findElement(By.xpath("//*[text()=' Rented ']")).click();	

			driver.findElement(By.id("ddlPropertyAge")).sendKeys(ageOFProperty);

			driver.findElement(By.xpath("//*[text()=' Flat / Apartment ']")).click();

			if (riskType.equalsIgnoreCase("Content")) {
				driver.findElement(By.xpath("//*[@for='rdContent']")).click();
			} else if (riskType.equalsIgnoreCase("Structure")) {
				driver.findElement(By.xpath("//*[@for='rdStruct']")).click();
			}else if (riskType.equalsIgnoreCase("ContentAndStructure")) {
				driver.findElement(By.xpath("//*[text()=' Structure + Content ']")).click();
			}
			
			
		} catch (Exception exception) {
			System.out.println(exception.toString());
		}
	}
	
	public static void yourDetails(WebDriver driver,String name,String date,String month,String year,String annualIncome,String email,String mobile){
		try {
			driver.findElement(By.id("txtName")).sendKeys(name);

			driver.findElement(By.xpath("//*[@for='rdMale']")).click();

			driver.findElement(By.xpath("//*[@for='rdMarried']")).click();

			driver.findElement(By.id("MainContent_BookingEngineNew_ucDateOfBirth_drpDay")).sendKeys(date);

			driver.findElement(By.id("MainContent_BookingEngineNew_ucDateOfBirth_drpMonth")).sendKeys(month);

			driver.findElement(By.id("MainContent_BookingEngineNew_ucDateOfBirth_drpYear")).sendKeys(year);

			driver.findElement(By.id("ddlAnnualIncome")).sendKeys(annualIncome);

			driver.findElement(By.id("txtEmail")).sendKeys(email);

			driver.findElement(By.id("txtMobile")).sendKeys(mobile);

		} catch (Exception exception) {
			System.out.println(exception.toString());
		}

	}


}
