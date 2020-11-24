package com.automation.appium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PerfectoWeb {

	public static void main(String[] args) {
		RemoteWebDriver driver = null;
		try {
			String browserName = "mobileOS";
			DesiredCapabilities capabilities = new DesiredCapabilities(	browserName, "", Platform.ANY);
			String host = "<Your Cloud>.perfectomobile.com";
			capabilities.setCapability("user", "<Your User>");
			capabilities.setCapability("password", "<Your Password>");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("scriptName", "PerfectoWeb");
			driver = new RemoteWebDriver(new URL("https://"	+ host + "/nexperience/perfectomobile/wd/hub"),	capabilities);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.google.com");
			System.out.println("Successfully opened the website www.google.com");
			Thread.sleep(3000);
			driver.findElement(By.id("lst-ib")).sendKeys("Perfecto Mobile\n");
			driver.findElement(By.linkText("Perfecto Mobile")).click();
			Thread.sleep(15000);
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}
	}
}