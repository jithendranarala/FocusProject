package com.automation.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

import com.automation.selenium.utils.ApplicationConstants;

/*https://launchpad.net/sikuli/+download*/
public class Example1 {

	public static void main(String args[]) {

		WebDriver driver = null;

		try {

			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);

			driver = new ChromeDriver();
			
			System.out.println("Driver:"+driver.toString());
			//driver.manage().window().maximize();

			driver.get("http://www.applypanonline.com");
			
			Thread.sleep(15000);

			Screen screen = new Screen();
			
			screen.setAutoWaitTimeout(60);
			
			// click on link ApplyFor new Pan
			screen.click(ApplicationConstants.screensLocation + "Link_ApplyForNewPan.PNG");

			// Enter text in FirstName
			screen.type(ApplicationConstants.screensLocation + "txt_FirstName.PNG", "SCOTT");
			
			// Enter text in LastName
			screen.type(ApplicationConstants.screensLocation + "txt_LastName.PNG", "TIGER");

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			driver.close();
		}

	}

}
