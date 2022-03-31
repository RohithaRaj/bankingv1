package com.banking1.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.banking1.utilities.Readconfig;

public class Baseclass {
	Readconfig readconfig = new Readconfig();
	public String baseurl=readconfig.getApplicationURL();
	public String username=readconfig.getUserName();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		 logger=Logger.getLogger("ebanking");   
		PropertyConfigurator.configure("log4j2.properties");
	
	if(br.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
		driver =new FirefoxDriver();
	}
	else if(br.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());	
		driver =new ChromeDriver();
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(baseurl);
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	public void captureScreen(WebDriver driver, String tname)throws IOException{
		TakesScreenshot tc = (TakesScreenshot)driver;
		File source =tc.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+ tname + ".png");
		FileUtils.copyFile(source,target);
		System.out.println("Screenshot Taken");
	}
	public String randomstring() 
	{
		String generatestring=RandomStringUtils.randomAlphabetic(8);
		return(generatestring);
	}
	
	public String randomnum() 
	{
		String generatestring2=RandomStringUtils.randomAlphanumeric(5);
		return(generatestring2);
	}
}
