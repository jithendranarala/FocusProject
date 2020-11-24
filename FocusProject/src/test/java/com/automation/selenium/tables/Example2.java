package com.automation.selenium.tables;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to retrieve data from  Tables*/
public class Example2 {

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
	public void tableData() throws Exception {
		driver.get("http://www.apsrtconline.in/oprs-web/");
		driver.findElement(By.xpath("//*[@value='Depart On']")).click();		
		Thread.sleep(2000);
		List<WebElement> tables = driver.findElements(By.xpath("//table"));
		System.out.println("Tables Count:" + tables.size());
		WebElement table = driver.findElement(By.xpath("(//table)[2]"));
		DriverHelper.highlightObject(driver, table);
		List<WebElement> rows = table.findElements(By.xpath(".//tr"));
		System.out.println("Number of Rows:" + rows.size());
		List<WebElement> columns = null;
		for (int index = 0; index < rows.size(); index++) {
			DriverHelper.highlightObject(driver, rows.get(index));
			if(index==0){
				columns = rows.get(index).findElements(By.xpath(".//th"));
			}else{
				columns = rows.get(index).findElements(By.xpath(".//td"));
			}
			Iterator<WebElement> columnsIterator = columns.iterator();
			while(columnsIterator.hasNext()){
				WebElement column = columnsIterator.next();
				//DriverHelper.highlightObject(driver, column);
				System.out.print(column.getText() + "\t");
			}
			System.out.println();
		}
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
}
