package com.automation.autoit;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class Example3 {

	@Test
	public void download() {
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			driver.get("http://www.seleniumhq.org/download/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement downloadSelenium = driver.findElement(By.xpath("//*[text()='Download version ']/a"));
			Actions actions = new Actions(driver);
			actions.contextClick(downloadSelenium).perform();
			Thread.sleep(2000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			Runtime.getRuntime().exec(ApplicationConstants.exeLocation + "Download.exe");
			Thread.sleep(7000);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			driver.quit();
		}

	}
}
