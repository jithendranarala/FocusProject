package com.automation.testNG;

import org.testng.annotations.Test;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class Example13 {

	private WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				ApplicationConstants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
	}

	@Test(dataProvider = "getTestData")
	public void loginAndVerifyTitle(String userName, String password) {
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
	public void afterTest() {
		driver.quit();
	}

	@DataProvider(name = "getTestData")
	public Object[][] getTestData() {
		Object[][] testData = null;
		int numberOfRows;
		int numberOfColumns;
		Workbook workBook = null;
		Sheet sheet = null;
		Row row = null;
		String testDataFile = ApplicationConstants.newtoursTestData;
		try {
			if (testDataFile.endsWith(".xlsx")) {
				workBook = new XSSFWorkbook(new FileInputStream(testDataFile));
			} else if (testDataFile.endsWith(".xls")) {
				workBook = new HSSFWorkbook(new FileInputStream(testDataFile));
			}

			sheet = workBook.getSheet("TestData");
			numberOfRows = sheet.getPhysicalNumberOfRows();
			numberOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();
			testData = new Object[numberOfRows-1][numberOfColumns-1];
			System.out.println("NumberOfRows:" + numberOfRows);
			System.out.println("NumberOfColumns:" + numberOfColumns);
			for (int rowIndex = 1; rowIndex < numberOfRows; rowIndex++) {
				row = sheet.getRow(rowIndex);
				numberOfColumns = row.getPhysicalNumberOfCells();
				for (int column = 1; column < numberOfColumns; column++) {
					System.out.println(row.getCell(column).toString());
					testData[rowIndex-1][column-1] = row.getCell(column).toString();
				}
			}
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			try {
				workBook.close();
			} catch (Exception exception) {
				System.out.println(exception.getMessage());
			}

		}
		return testData;

	}

}
