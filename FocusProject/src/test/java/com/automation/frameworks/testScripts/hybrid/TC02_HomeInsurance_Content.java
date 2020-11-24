package com.automation.frameworks.testScripts.hybrid;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.frameworks.core.FrameworkScript;
import com.automation.frameworks.helper.ActionsHelper;

public class TC02_HomeInsurance_Content extends FrameworkScript {
		
		@Test
		public void createHomeInsurance() {
			try {
				
				driver.get("https://www.policybazaar.com/");
				
				ActionsHelper.yourHome(driver,testData("AgeOfTheProperty"),"Content");
				
				Thread.sleep(2000);

				driver.findElement(By.id("next_1")).click();
				
				driver.findElement(By.id("ddlFurnitureCover")).sendKeys(testData("Furniture"));
				
				driver.findElement(By.id("ddlEquipmentCover")).sendKeys(testData("Equipment"));
				
				driver.findElement(By.id("ddlAppliancesCover")).sendKeys(testData("Appliances"));
				
				driver.findElement(By.xpath("//*[@for='rdBurglaryNo']")).click();
				
				Thread.sleep(2000);

				driver.findElement(By.id("next_2")).click();

				ActionsHelper.yourDetails(driver,testData("Name"),testData("Date"),testData("Month"),testData("Year"),testData("AnnualIncome"),testData("Email"),testData("Mobile"));
				
				Thread.sleep(2000);

			} catch (Exception exception) {
				System.out.println(exception.toString());
			}
		}

}
