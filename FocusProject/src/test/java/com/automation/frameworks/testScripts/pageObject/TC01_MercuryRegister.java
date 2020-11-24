package com.automation.frameworks.testScripts.pageObject;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.frameworks.core.FrameworkScript;
import com.automation.frameworks.exceptions.FrameworkException;
import com.automation.frameworks.screens.HomePage;
import com.automation.frameworks.screens.RegisterPage;
import com.automation.frameworks.screens.SignOnPage;

public class TC01_MercuryRegister extends FrameworkScript {
	
	@Test
	public void createAccount() {
		try {

			driver.get("http://newtours.demoaut.com");
			
			Assert.assertEquals(driver.getTitle(),"Welcome: Mercury Tours","Title verification");
			
			HomePage.link_Register.click();
			
			Assert.assertEquals(driver.getTitle(),"Register: Mercury Tours","Title verification");
			
			/*Enter FirstName */
			RegisterPage.text_FirstName.sendKeys(testData("FirstName"));
			
			/*Enter LastName*/
			RegisterPage.text_LastName.sendKeys(testData("LastName"));

			/*Enter Phone Number */
			RegisterPage.text_Phone.sendKeys(testData("Phone"));
			
			/*Enter Email*/
			RegisterPage.text_Email.sendKeys(testData("Email"));
			
			/*Enter Address*/
			RegisterPage.text_Address.sendKeys(testData("Address"));
			
			/*Enter City*/
			RegisterPage.text_City.sendKeys(testData("City"));
			
			/*Enter State */
			RegisterPage.text_State.sendKeys(testData("State"));
			
			/*Enter Postal Code*/
			RegisterPage.text_PostalCode.sendKeys(testData("PostalCode"));
			
			/*Enter Country */
			RegisterPage.text_PostalCode.sendKeys(testData("Country"));
			
			/*Enter UserName*/
			RegisterPage.text_UserName.sendKeys(testData("UserName"));
			
			/*Enter Password */
			RegisterPage.text_Password.sendKeys(testData("Password"));
			
			/*Enter Confirm Password*/
			RegisterPage.text_CPassword.sendKeys(testData("CPassword"));
			
			/*Click on Submit button */
			RegisterPage.btn_Submit.click();
			
			/*Click on Sign in link */
			RegisterPage.lnk_SignIn.click();
			
			/* Enter user name */
			SignOnPage.text_UserName.sendKeys(testData("UserName"));
			
			/* Enter password */
			SignOnPage.text_Password.sendKeys(testData("Password"));
			
			/* click on  submit button */
			SignOnPage.btnt_Login.click();
			
			/* click on sign off button */
			HomePage.link_SignOff.click();
			
		} catch (Exception exception) {
			new FrameworkException(exception);
		}

	}

}
