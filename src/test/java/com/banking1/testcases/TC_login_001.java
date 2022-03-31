package com.banking1.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking1.pageobjects.LoginPage;

public class TC_login_001 extends Baseclass {
	@Test
	public void logintest() throws IOException
	{
		
		logger.info("Url opened");
		LoginPage lp = new LoginPage(driver);
		lp.setusername(username);
		logger.info("entered username");
		lp.setpassword(password);
		logger.info("entered password");
		lp.submit();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("login test passed");
		}
		else
		{
			captureScreen(driver,"logintest");
			Assert.assertTrue(false);
			logger.info("login test failed");
		}
	}
}
