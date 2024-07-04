package com.titrate.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.titrate.utilities.ReadConfig;

public class BaseClass 
{
	
	ReadConfig r=new ReadConfig();
	public String baseURL=r.getUrl();
	public String uname=r.getUname();
	public String password=r.getPassword();
	public String browser=r.getBrowser();
	public static WebDriver driver;
	
	@BeforeClass

	public void setup() 
	{
	
	
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize(); 
			
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
		driver= new FirefoxDriver();
			driver.manage().window().maximize();
		}

		else if(browser.equalsIgnoreCase("edge")) 
		{
			driver= new EdgeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("ie")) 
		{
			driver= new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("safari")) 
		{
			driver= new SafariDriver();
			driver.manage().window().maximize();
	}
		else
		System.out.println("selected browser is not supported");
	
		driver.get(baseURL);
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}
