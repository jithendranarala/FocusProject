package com.automation.frameworks.core;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.automation.frameworks.helper.DriverHelper;
import com.automation.frameworks.helper.TestDataHelper;
import com.automation.frameworks.screens.HomePage;
import com.automation.frameworks.screens.RegisterPage;
import com.automation.frameworks.screens.SignOnPage;
import com.automation.frameworks.utils.Logger;
import com.automation.frameworks.utils.Reporter;
import com.automation.selenium.utils.ApplicationConstants;

public class FrameworkScript {

	protected WebDriver driver = null;

	private TestDataHelper dataHelper = null;
	protected HashMap<String, String> data = null;
	
	@BeforeTest
	protected void onInitialize() {
		String scriptName = null;
		try {
			scriptName = this.getClass().getSimpleName();
			Reporter.startScript(scriptName);
			Logger.info("onInitialize");
			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			DriverHelper.setWebDriver(driver);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			dataHelper = new TestDataHelper();
			data = dataHelper.getData(scriptName);
			PageFactory.initElements(driver, HomePage.class);
			PageFactory.initElements(driver, RegisterPage.class);
			PageFactory.initElements(driver, SignOnPage.class);
		} catch (Exception exception) {
			Logger.error(exception.getMessage());
		}

	}
	
	protected String testData(String columnName) {
		return data.get(columnName);

	}

	@AfterTest
	protected void onTerminate() {
		Logger.info("onTerminate");
		try {
			driver.close();
			Reporter.endScript();
		} catch (Exception exception) {
			Logger.error(exception.getMessage());
		}
	}

}
