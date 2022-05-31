package com.learnautomation.utility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	
	
	public static WebDriver StartBrowser(WebDriver driver,String browserName,String appurl) 
	
	{
		if(browserName.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		else if (browserName.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else {
			System.out.println("Invalid browser name");
		}
		driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.get(appurl);
		
		return driver;
	}
	public static void quitBrowser(WebDriver driver) throws Exception {
		Thread.sleep(5000);
		 driver.quit();
	}
	
}
