package com.automation.selenium.windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to use switchToWindow method*/
public class Example1 {

	@Test
	public void test() {
		WebDriver driver = null;
		try {
			driver = DriverHelper.getDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			driver.get("http://www.ghmc.gov.in");

			Thread.sleep(3000);

			Set<String> windowHandles = driver.getWindowHandles();

			System.out.println("Number of Windows/Browsers:"+ windowHandles.size());

			Object[] windows = windowHandles.toArray();

			System.out.println("Main Window Title:" + driver.getTitle());

			driver.close();

			driver.switchTo().window(windows[1].toString());

			System.out.println("Child Window Title:" + driver.getTitle());

			Thread.sleep(1000);
			
			driver.close();
			
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		}

	}
}
