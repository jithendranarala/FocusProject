package com.automation.selenium.keyboardActions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example1 {

	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources"	+ File.separator + "drivers" + File.separator + "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void keyboardEventEnter() throws Exception {
		driver.get("http://electoralsearch.in/");
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
