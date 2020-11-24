package com.automation.frameworks.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(linkText="REGISTER")
	public static WebElement link_Register;

	@FindBy(name = "userName")
	public static WebElement text_UserName;

	@FindBy(name = "password")
	public static WebElement text_Password;
	
	@FindBy(linkText = "SIGN-OFF")
	public static WebElement link_SignOff;

}
