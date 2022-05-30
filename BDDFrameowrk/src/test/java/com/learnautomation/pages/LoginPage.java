package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	WebDriver driver;
	
	void LoginPage(WebDriver ldriver) {
		
		this.driver=ldriver;
		
	}
	@FindBy(name="email") WebElement usrname;
	@FindBy(name="password") WebElement passwrd;
	@FindBy(xpath="//button[@type='submit']") WebElement loginbtn;
	
	public void logintoApp(String row ,String col) {
		usrname.sendKeys(row);
		passwrd.sendKeys(col);
		loginbtn.click();
		
	}
}
