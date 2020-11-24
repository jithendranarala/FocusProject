package com.automation.selenium.windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to use switchToWindow method*/
public class Example0 {

	@Test
	public void test() {
		WebDriver driver = null;
		try {
			driver = DriverHelper.getDriver("CHROME");

			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			driver.get("http://www.google.com");

			System.out.println("WindowHandle:" + driver.getWindowHandle());

			Set<String> windowHandles = driver.getWindowHandles();

			System.out.println("Number of Windows/Browsers:"+ windowHandles.size());
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
