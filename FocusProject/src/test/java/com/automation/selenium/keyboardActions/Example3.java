package com.automation.selenium.keyboardActions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Example3 {

WebDriver driver = null;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources"	+ File.separator + "drivers" + File.separator + "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void keyDownAndKeyUp() throws Exception {
		driver.get("https://www.applypanonline.com/new-pan-card-applicationform.php");
		Actions actions = new Actions(driver);
		WebElement firstName = driver.findElement(By.id("firstnameupp"));
		actions.click(firstName);
		actions.keyDown(Keys.SHIFT);
		actions.sendKeys("scott");
		actions.keyUp(Keys.SHIFT);
		actions.perform();
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.id("lastnameupp"));
		actions.click(lastName);
		actions.keyDown(Keys.SHIFT);
		actions.sendKeys("TIGER");
		actions.keyUp(Keys.SHIFT);
		actions.perform();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	
}
