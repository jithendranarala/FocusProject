package com.automation.frameworks.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOnPage{

	@FindBy(name = "userName")
	public static WebElement text_UserName;

	@FindBy(name = "password")
	public static WebElement text_Password;

	@FindBy(name = "login")
	public static WebElement btnt_Login;


}
