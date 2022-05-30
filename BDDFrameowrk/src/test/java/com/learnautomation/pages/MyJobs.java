package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyJobs {

WebDriver driver;
	
	public void Applications(WebDriver Adriver) {
		
		this.driver = Adriver;
		
	}
	@FindBy(xpath="//button[@aria-label='Applications']") WebElement Applicns;
	@FindBy(xpath="//button[@aria-label='Search']") WebElement Search;
	
	public void ApplicationsVerify() {
		
		Applicns.click();
		Search.click();
	}
}
