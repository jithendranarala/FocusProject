package com.automation.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class Example4 {

	@Test
	public void dragAndDrop(){
		
		WebDriver driver = null;
		
		try {

			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER_PATH);

			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://jqueryui.com/droppable/");
			
			Screen screen = new Screen();
			
			screen.setAutoWaitTimeout(60);
			
			screen.dragDrop(ApplicationConstants.screensLocation+ "drag.PNG", ApplicationConstants.screensLocation+ "drop.PNG");

			Thread.sleep(2000);
			
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
