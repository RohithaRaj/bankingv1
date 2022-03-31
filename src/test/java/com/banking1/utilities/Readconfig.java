package com.banking1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;
	
	public Readconfig()
	{
		File src = new File("./configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println("Exception is"+ e.getMessage());
		}	
		
	}
public String getApplicationURL()
{
	String url=pro.getProperty("baseurl");
	return url;
}
public String getUserName()
{
	String username=pro.getProperty("username");
	return username;
}
public String getPassword()
{
	String password=pro.getProperty("password");
	return password;
}
	public String getFirefoxPath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
} 
