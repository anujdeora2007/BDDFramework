package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	 Properties prop;
	
	public ConfigDataProvider() {
	
		File src = new File("./Config/config.properties");
		
			try {
				FileInputStream fis = new FileInputStream(src);
				prop = new Properties();
				try {
					prop.load(fis);
				} catch (IOException e) {
					
					System.out.println(e.getMessage());
				}
			} catch (FileNotFoundException e) {
					System.out.println(e.getMessage());			
			}
	}
		
			public String getDataFromConfig(String KeyToSearch) {
			
			return prop.getProperty(KeyToSearch);
		}
		
		public String getBrowser() {
			
			return prop.getProperty("Browser");
		}
		
public String getAppUrl() {
			
		return	prop.getProperty("AppURL");
			
		}
	}

