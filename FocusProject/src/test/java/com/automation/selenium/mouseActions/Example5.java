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

/* This example show how to use moveToElement method*/
public class Example5 {
	
	WebDriver driver = null;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources"	+ File.separator + "drivers" + File.separator + "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void moveToElement() throws Exception{
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("http://www.techmahindra.com/pages/default.aspx");
		
		WebElement linkWeAre = driver.findElement(By.xpath("//*[text()='Who We Are']"));
	
		Actions actions = new Actions(driver);
		
		actions.moveToElement(linkWeAre).perform();
		
		Thread.sleep(2000);
		
		WebElement linkTechMahindra = driver.findElement(By.linkText("Tech Mahindra"));
		
		actions.moveToElement(linkTechMahindra).perform();
		
		Thread.sleep(2000);
		
		WebElement linkInnovation = driver.findElement(By.xpath("(//*[text()='Innovation'])[1]"));
		
		linkInnovation.click();
	
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void afterClass(){
		driver.quit();
	}

}
