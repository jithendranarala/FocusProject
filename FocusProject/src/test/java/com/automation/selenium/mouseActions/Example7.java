package com.automation.selenium.mouseActions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/* This example show how to use contextClick(RightClick) method*/
public class Example7 {

	WebDriver driver = null;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources"	+ File.separator + "drivers" + File.separator + "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void rightClick() throws Exception {
		driver.get("http://medialize.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClick =  driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick).perform();
		Thread.sleep(2000);
		WebElement editOPtion = driver.findElement(By.xpath("//span[text()='Edit']"));
		actions.click(editOPtion).perform();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
