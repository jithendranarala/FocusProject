package com.automation.selenium.keyboardActions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
	public void keyDownAndKeyUp() throws Exception {
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F11);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_F11);
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	
}
