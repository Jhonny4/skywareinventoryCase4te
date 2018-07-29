package com.Skywareinventory.pages;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skywareinventory.utilities.Driver;

public class RegisterPage {

	public RegisterPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "pageTitle")
	public WebElement pageTitle;

	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(id = "password2")
	public WebElement confirmPasword;

	@FindBy(id = "accountName")
	public WebElement accountName;

	@FindBy(id = "profile_firstName")
	public WebElement firstName;

	@FindBy(id = "profile_lastName")
	public WebElement lastName;

	@FindBy(id = "countrySelect")
	public WebElement country;

	@FindBy(id = "profile_address1")
	public WebElement address;

	@FindBy(id = "profile_city")
	public WebElement city;

	@FindBy(id = "stateSelect")
	public WebElement state;

	@FindBy(id = "profile_zip")
	public WebElement zip;

	@FindBy(id = "profile_phone")
	public WebElement phoneNumber;

	@FindBy(id = "licenseAccepted")
	public WebElement licenseAccepted;

	@FindBy(id = "createButton")
	public WebElement createButton;

}
