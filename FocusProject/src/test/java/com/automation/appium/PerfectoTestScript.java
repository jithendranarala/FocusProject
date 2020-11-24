package com.automation.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PerfectoTestScript {

	protected static AppiumDriver<MobileElement> driver = null;

	public static void main(String args[]) {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"a1a1e4a3");
			capabilities.setCapability("user", "****");
			capabilities.setCapability("password", "****");
			String host = "****.perfectomobile.com";
			String url = "https://" + host	+ "/nexperience/perfectomobile/wd/hub";
			capabilities.setCapability("automationName", "Appium");
			capabilities.setCapability("deviceName", "");
			driver = new AndroidDriver<MobileElement>(new URL(url),	capabilities);
			driver.get("https://www.policybazaar.com/");
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		}

	}

}
