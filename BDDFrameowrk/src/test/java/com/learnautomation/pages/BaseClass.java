package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ConfigDataProvider;
import com.learnautomation.utility.Helper;

public class BaseClass {

	public WebDriver driver;
	public ConfigDataProvider config;
	
	//Creating the object of the class below
	@BeforeSuite
	public void setUpSuite() {
		config = new ConfigDataProvider();
	}
	
	@BeforeClass
	public void startbrowser() {
		
		driver=BrowserFactory.StartBrowser(driver, config.getBrowser(), config.getAppUrl());
		
	}
	
	
	public void closeBrowser() {
		
		try {
			BrowserFactory.quitBrowser(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	//This method helps to take screenshot even if the test fails
	public void tearDownMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		Helper.captureScreenshots(driver);
	}
	
}
