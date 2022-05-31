package com.learnautomation.pages;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

public class MyJobs {

WebDriver driver;
	
	public void Applications(WebDriver Adriver) {
		
		this.driver = Adriver;
		
	}
	@FindBy(xpath="//*[contains(text(),'Find jobs')]") WebElement Applicns;
	
	
	public void ApplicationsVerify() {		
		
		Actions action = new Actions(driver);
		action.moveToElement(Applicns).perform();
		System.out.println(Applicns.getTagName());
				
	}
}
