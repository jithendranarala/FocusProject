package com.automation.frameworks.testScripts.hybrid;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.frameworks.core.FrameworkScript;
import com.automation.frameworks.helper.ActionsHelper;

public class TC01_HomeInsurance_Structure extends FrameworkScript {

	@Test
	public void createHomeInsurance() {
		try {
			
			driver.get("https://www.policybazaar.com/");
			
			ActionsHelper.yourHome(driver,testData("AgeOfTheProperty"),"Structure");
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("next_1")).click();

			driver.findElement(By.id("ddlStructureCover")).sendKeys(testData("SumInsured"));
			
			Thread.sleep(2000);

			driver.findElement(By.id("next_2")).click();
			
			ActionsHelper.yourDetails(driver,testData("Name"),testData("Date"),testData("Month"),testData("Year"),testData("AnnualIncome"),testData("Email"),testData("Mobile"));
			
			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println(exception.toString());
		}
	}
	
}
