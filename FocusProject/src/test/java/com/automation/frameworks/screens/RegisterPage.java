package com.automation.frameworks.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

	@FindBy(name="firstName")
	public static WebElement text_FirstName;

	@FindBy(name="lastName")
	public static WebElement text_LastName;

	@FindBy(name="phone")
	public static WebElement text_Phone;

	@FindBy(id="userName")
	public static WebElement text_Email;

	@FindBy(name="address1")
	public static WebElement text_Address;

	@FindBy(name="city")
	public static WebElement text_City;
	
	@FindBy(name="state")
	public static WebElement text_State;
	
	@FindBy(name="postalCode")
	public static WebElement text_PostalCode;
	
	@FindBy(name="country")
	public static WebElement list_Country;
	
	@FindBy(name="email")
	public static WebElement text_UserName;

	@FindBy(name="password")
	public static WebElement text_Password;

	@FindBy(name="confirmPassword")
	public static WebElement text_CPassword;

	@FindBy(name="register")
	public static WebElement btn_Submit;
	
	@FindBy(linkText="sign-in")
	public static WebElement lnk_SignIn;

}
