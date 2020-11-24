package com.automation.selenium.jsAlerts;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get("http://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		Thread.sleep(5000);
		
		Alert alert =  driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		Thread.sleep(2000);
		
		driver.close();
				
	}

}
