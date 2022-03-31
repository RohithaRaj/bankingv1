package com.banking1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Add_customer {

	WebDriver ldriver;

	 public Add_customer(WebDriver rdriver)
		 {
			 ldriver = rdriver;
			 PageFactory.initElements(rdriver, this); 
		 }
		 @FindBy(how=How.LINK_TEXT, using="New Customer")
		 WebElement lnkAddNewCustomer;
		 
		 @FindBy(how=How.NAME, using="name")
		 WebElement txtCustomerName;
		 
		 @FindBy(how=How.XPATH, using= "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
		 WebElement rdGender;
		 
		 @FindBy(how=How.ID_OR_NAME, using= "dob")
		 WebElement textdob;
		 
		 @FindBy(how=How.NAME, using="addr")
		 WebElement txtaddress;
		 
		 
		 @FindBy(how=How.NAME, using="city")
		 WebElement txtcity;
		 
		 
		 @FindBy(how=How.NAME, using="state")
		 WebElement txtstate;
		 
		 @FindBy(how=How.NAME, using="pinno")
		 WebElement txtpincode;
		 
		 @FindBy(how=How.NAME, using="telephoneno")
		 WebElement txttelenum;
		 
		 @FindBy(how=How.NAME, using="emailid")
		 WebElement txtemail;
		 
		 @FindBy(how=How.NAME, using="password")
		 WebElement txtpassword;
		 
		 @FindBy(how=How.NAME, using="sub")
		 WebElement btnsubmit;
		 
		  public void clickAddNewCustomer()
		  {
			  lnkAddNewCustomer.click();
		  }
		 
		  public void custName(String cname)
		  {
			  txtCustomerName.sendKeys(cname);
		  }
		  
		  public void custgender(String cgender)
		  {
			  rdGender.click();
		  }
		  public void custdob(String mm, String dd, String yy) {
				textdob.sendKeys(mm);
				textdob.sendKeys(dd);
				textdob.sendKeys(yy);
				// TODO Auto-generated method stub
				
			}
		  
		  public void custaddress(String caddress)
		  {
			  txtaddress.sendKeys(caddress);
		  }
		  
		  public void custcity(String ccity)
		  {
			  txtcity.sendKeys(ccity);
		  }
		 
		  public void custstate(String cstate)
		  {
			  txtstate.sendKeys(cstate);
		  }
		 
		  public void custpincode(String cpinno)
		  {
			  txtpincode.sendKeys(String.valueOf(cpinno));
		  }
		 
		  public void custteleno(String cteleno)
		  {
			  txttelenum.sendKeys(cteleno);
		  }
		 
		  public void custemailid(String cemailid)
		  {
			  txtemail.sendKeys(cemailid);
		  }
		  
		  public void custpassword(String cpassword)
		  {
			  txtpassword.sendKeys(cpassword);
		  }
		  
		  public void custsubmit()
		  {
			  btnsubmit.click();
		  }

		
}

