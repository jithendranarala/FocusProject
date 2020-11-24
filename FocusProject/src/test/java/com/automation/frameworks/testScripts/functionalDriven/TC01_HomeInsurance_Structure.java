package com.automation.frameworks.testScripts.functionalDriven;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.frameworks.core.FrameworkScript;
import com.automation.frameworks.helper.ActionsHelper;

public class TC01_HomeInsurance_Structure extends FrameworkScript {

	@Test
	public void createHomeInsurance() {
		try {
			
			driver.get("https://www.policybazaar.com/");
			
			ActionsHelper.yourHome(driver,"Upto 30 years","Structure");
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("next_1")).click();

			driver.findElement(By.id("ddlStructureCover")).sendKeys("50,00,000");
			
			Thread.sleep(2000);

			driver.findElement(By.id("next_2")).click();
			
			ActionsHelper.yourDetails(driver,"Scott","11","Aug","1985","10-15 Lakhs","Scott@scott.com","9112345678");
			
			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println(exception.toString());
		}
	}
	
}
