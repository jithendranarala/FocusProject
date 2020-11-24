package com.automation.testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class Example12 {

private WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest(){
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
	}

	@Test(dataProvider="getTestData")
	public void loginAndVerifyTitle(String userName,String password) {
		String expectedTitle = "Find a Flight: Mercury Tours:";
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		String actualTitle = driver.getTitle().trim();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Actual Title is same as Expected Title");
		} else {
			System.out.println("Actual Title is not same as Expected Title");
		}
	}
	
	@AfterTest
	public void afterTest(){
		driver.quit();
	}
	
	@DataProvider(name = "getTestData")
	public Object[][] getTestData() {
		String[][] testData = new String[3][2];

		testData[0][0] = "mercury";
		testData[0][1] = "mercury";

		testData[1][0] = "scott";
		testData[1][1] = "scott";

		testData[2][0] = "tiger";
		testData[2][1] = "tiger";

		return testData;
	}

}
