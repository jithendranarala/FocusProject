package com.automation.selenium.keyboardActions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example2 {

	WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources"	+ File.separator + "drivers" + File.separator + "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void keyboardEvent() throws Exception {
		driver.get("http://medialize.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClick =  driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.ARROW_UP).perform();
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
