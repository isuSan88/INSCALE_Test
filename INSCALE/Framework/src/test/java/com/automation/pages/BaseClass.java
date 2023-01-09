package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utility.BrowserFactory;
import com.automation.utility.ConfigDataProvider;
import com.automation.utility.Helper;

public class BaseClass {
	public WebDriver driver;
	public ConfigDataProvider config;

@BeforeSuite
	public void setUpSuite()
	{
		
	
		 config=new ConfigDataProvider();
		
	}
	
	@BeforeClass
	public void setup(){
		driver=BrowserFactory.startApplication(driver,config.getBrowser(),config.getStagingURL());
			
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}

	public void tearDownMethod(ITestResult result) 
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.captureScreenshot(driver);
		}
	}
}
