package com.Skywareinventory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skywareinventory.utilities.Driver;

public class LogInPage {
	public LogInPage(){
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "username")
	public WebElement userName;
	
	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(xpath = "//*[@type ='submit' ]")
	public WebElement submitButton;
	
	@FindBy(id = "messages")
	public WebElement invalidCredentialMessage;
}
