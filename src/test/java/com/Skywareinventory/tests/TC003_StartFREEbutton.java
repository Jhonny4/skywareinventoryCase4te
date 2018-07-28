package com.Skywareinventory.tests;


import org.testng.annotations.Test;

import com.Skywareinventory.utilities.ConfigurationReader;

public class TC003_StartFREEbutton  extends TestBase{
	
	@Test
	public void launchURL() {
		driver.get(ConfigurationReader.getProperty("url"));
	}
	

}
