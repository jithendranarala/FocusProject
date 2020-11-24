package com.automation.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class Example2 {

	@Test
	public void clickAndDoubleClick(){
		
		WebDriver driver = null;
		
		try {

			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER_PATH);

			driver = new ChromeDriver();

			driver.get("http://www.mkyong.com/wp-content/uploads/jQuery/jQuery-click-dblclick-example.html");
			
			driver.manage().window().maximize();
			
			Screen screen = new Screen();
			
			screen.setAutoWaitTimeout(60);
			
			screen.doubleClick(ApplicationConstants.screensLocation+ "link_DoubleClick.PNG");
			
			screen.click(ApplicationConstants.screensLocation+ "link_SingleClick.PNG");
			
			Thread.sleep(2000);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
