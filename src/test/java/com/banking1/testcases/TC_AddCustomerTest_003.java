package com.banking1.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking1.pageobjects.Add_customer;
import com.banking1.pageobjects.LoginPage;

public class TC_AddCustomerTest_003 extends Baseclass 
{
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setusername(username);
		logger.info("user name is provided");
		lp.setpassword(password);
		logger.info("password is provided");
		lp.submit();
		
		Thread.sleep(3000);
		
		Add_customer addcus=new Add_customer(driver);
		addcus.clickAddNewCustomer();
		logger.info(" provided the customer details ");
		
		addcus.custName("Rohitha");
		addcus.custgender("female");
		Thread.sleep(5000); 
		addcus.custdob("11","10","1995");
		Thread.sleep(5000);
		addcus.custaddress("INDIA");
		addcus.custcity("Bangalore");
		addcus.custstate("Karnataka");
		addcus.custpincode("560000");
		addcus.custteleno("8529631470");
		
		String email=randomstring()+"@gmail.com";
		addcus.custemailid( email);
		addcus.custpassword("abcdef");
		Thread.sleep(5000);
		addcus.custsubmit();
		
		Thread.sleep(3000);
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info(" testcase passed");
		}
		else
		{
			logger.info("testcase failed");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
	}	
	

}
