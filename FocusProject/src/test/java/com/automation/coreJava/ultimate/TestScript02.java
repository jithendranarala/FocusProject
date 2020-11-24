package com.automation.coreJava.ultimate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/* final @class level if you uncomment 10 th line of FrameworkScript then it will give error message at 7 and 12 th line of this class*/
public class TestScript02 extends FrameworkScript {

	private WebDriver driver = null;
	
	public void createAccount() {
		driver = launchBrowser("CHROME");
		driver.get("https://www.applypanonline.com/");
		driver.findElement(By.linkText("Apply for New PAN")).click();
		driver.findElement(By.id("firstnameupp")).sendKeys("SCOTT");
		driver.close();
	}

	public static void main(String[] args) {
		TestScript02 script02 = new TestScript02();
		script02.createAccount();
	}


}
