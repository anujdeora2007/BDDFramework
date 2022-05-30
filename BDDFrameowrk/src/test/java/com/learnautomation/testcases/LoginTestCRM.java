package com.learnautomation.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.pages.MyJobs;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;



public class LoginTestCRM extends BaseClass{

	
	
	@Test
	public void login() {
		
	ExcelDataProvider EDP = new ExcelDataProvider();
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.logintoApp(EDP.getStringData("Credentials",0,0), EDP.getStringData("Credentials",0,1) );
		Helper.captureScreenshots(driver);
		
	}
	
	public void myJobsPage() {
		
		MyJobs myjobs = PageFactory.initElements(driver, MyJobs.class);
		myjobs.ApplicationsVerify();
		
	}
}
