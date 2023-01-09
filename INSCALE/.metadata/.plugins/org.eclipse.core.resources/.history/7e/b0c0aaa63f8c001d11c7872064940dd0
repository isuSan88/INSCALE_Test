package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() {
		try {
			File src = new File("./Config/config.properties");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {
			System.out.println("No able to load the file" + e.getMessage());
		}

	}
	public String getDataFromConfig(String keyToSearch)
	{
		return pro.getProperty(keyToSearch);
	}
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	
	public String getStagingURL()
	{
		return pro.getProperty("qaURL");
	}
	
	
}