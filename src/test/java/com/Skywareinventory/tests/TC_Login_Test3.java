package com.Skywareinventory.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Skywareinventory.pages.HomePage;
import com.Skywareinventory.pages.LogInPage;
import com.Skywareinventory.utilities.ConfigurationReader;

public class TC_Login_Test3 extends TestBase{

	HomePage homepage = new HomePage();
	LogInPage loginpage = new LogInPage();
	
	@Test
	public void TC008() {
		driver.get(ConfigurationReader.getProperty("url"));
		String actual = driver.getTitle();
		String expected = ConfigurationReader.getProperty("titleHomePage");
		assertEquals(actual, expected ,"Verify Title");
		Assert.assertTrue(homepage.loginButton.isEnabled());
		homepage.loginButton.click();
		actual =driver.getTitle();
		expected = ConfigurationReader.getProperty("titleLogInPage");
		assertEquals(actual, expected);
		loginpage.userName.sendKeys(ConfigurationReader.getProperty("invalidUser"));
		loginpage.password.sendKeys(ConfigurationReader.getProperty("invalidPassword"));
		Assert.assertTrue(loginpage.submitButton.isEnabled());
		loginpage.submitButton.click();
		actual = loginpage.invalidCredentialMessage.getAttribute("value");
		Assert.assertEquals(actual, ConfigurationReader.getProperty("invalidLogMessag"));
		
	}
	

}
