package com.automation.emulator;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

public class TC01_City {

	private WebDriver driver = null;

	@BeforeTest
	private void setUp() {
		
		Map<String, String> mobileEmulation = null;
		Map<String, Object> chromeOptions = null;
		try {
			String DeviceName = "Google Nexus 5";
			DesiredCapabilities capabilities = null;
			
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER_PATH);
			mobileEmulation = new HashMap<String, String>();
			mobileEmulation.put("deviceName", DeviceName);

			chromeOptions = new HashMap<String, Object>();
			chromeOptions.put("mobileEmulation", mobileEmulation);

			capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			driver = new ChromeDriver(capabilities);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		}

	}
	
	@Test
	public void createHomeInsurance() {

		try {
			driver.get("https://financingsolutionscentreuat.citiretailservices.ca/esignature");

			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("testdevcasuper1");
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("devpass01");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			//Your application details		
			
			driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("500");
			
			driver.findElement(By.xpath("//label[@for='coborrowerSelection1']")).click();
			
			driver.findElement(By.xpath("//label[@for='ownerSelection1']")).click();
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			//Personal Details
			
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("abxc");
			
			driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("middle");
			
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("xyzx");
			
			driver.findElement(By.xpath("//select[@id='calendar_day']")).sendKeys("12");
			
			driver.findElement(By.xpath("//select[@id='calendar_month']")).sendKeys("12");
			
			driver.findElement(By.xpath("//select[@id='calendar_year']")).sendKeys("1998");
			
			driver.findElement(By.xpath("//span[text()='Confirm']")).click();
			
			driver.findElement(By.xpath("//input[@id='streetAddress']")).sendKeys("StreetAddress");
			
			driver.findElement(By.xpath("//input[@id='apartment']")).sendKeys("Apartment");
			
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys("City");
			
			driver.findElement(By.xpath("//select[@id='province']")).sendKeys("Ontario");
			
			driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("A1V2S3");
			
			driver.findElement(By.xpath("//input[@id='phonePrimary']")).sendKeys("1234567890");
			
			driver.findElement(By.xpath("//input[@id='phoneWork']")).sendKeys("1234567890");
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			//Identity verification		

			driver.findElement(By.xpath("//input[@id='firstIdNumber']")).sendKeys("4321");
			
			driver.findElement(By.xpath("//input[@id='secondIdNumber']")).sendKeys("4567");
			
			driver.findElement(By.xpath("//*[contains(text(),'Next')]")).sendKeys("4567");
			
			//Housing & employment details		
			
			driver.findElement(By.xpath("//label[@for='timeCurrentAddressYear5']")).click();
			
			driver.findElement(By.xpath("//input[@id='monthlyPayment']")).sendKeys("100");
			
			driver.findElement(By.xpath("//input[@id='currentEmployer']")).sendKeys("CITI");

			driver.findElement(By.xpath("//label[@for='timeCurrentEmployerYear5']")).click();
			
			driver.findElement(By.xpath("//label[@for='position']")).sendKeys("Engineer");
			
			driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();
			
			//Legal consent
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gsdfhsf@citi.com");
			
			driver.findElement(By.xpath("//label[contains(text(),'No')]")).click();
			
			driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();
			
			//Review Application
			
			driver.findElement(By.xpath("//*[contains(text(),'Confirm and proceed')]")).click();
			
			//Review Application
			
			driver.findElement(By.xpath("//input[@id='disclosureAccepted']")).click();
			
			driver.findElement(By.xpath("//button[@id='action-bar-btn-continue']")).click();
			
			driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();


		} catch (Exception exception) {
			System.out.println(exception.toString());
		}
	}
	
	@AfterTest
	private void tearDown() {
		try {
			driver.close();
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		}
	}


}
