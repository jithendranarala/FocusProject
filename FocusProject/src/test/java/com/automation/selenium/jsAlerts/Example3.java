package com.automation.selenium.jsAlerts;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example3 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get(System.getProperty("user.dir") + File.separator + "resources" + File.separator  + "alerts" + File.separator +"ConfirmAlert.html");
		
		WebElement button = driver.findElement(By.xpath("//*[text()='Click on me']"));
		
		button.click();
		
		Thread.sleep(2000);
		
		Alert alert =  driver.switchTo().alert();
		
		System.out.println("Alert Text:" + alert.getText());
		
		alert.dismiss();
		
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.xpath("//*[@id='confirmAlert']")).getText());
		
		driver.close();
				
	}

}
