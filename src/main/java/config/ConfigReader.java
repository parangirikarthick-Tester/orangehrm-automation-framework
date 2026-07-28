package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static ConfigReader instance;
	private Properties properties; 
	
	private ConfigReader() 
	{
		try {
		
		
		properties = new Properties();
		String des = System.getProperty("user.dir") + "/src/test/resources/config.properties";
		FileInputStream file = new FileInputStream(des);
		properties.load(file);
		}
		catch(IOException e){
			throw new RuntimeException("config.properties file not found or unreadable", e);
			
		}
		
	}
	
	public static ConfigReader getInstance() 
	{
		if(instance == null)
		{
			instance = new ConfigReader();
			
		}
	
			return instance;
		
	}
	
	public String getBrowser()
	{
		String browser = properties.getProperty("browser");
		
		return browser;
		
	}
	public String getUrl()
	{
		String url = properties.getProperty("url");
		
		return url;
		
	}
	public String getUserName()
	{
		String username = properties.getProperty("username");
		
		return username;
		
	}
	public String getPassword()
	{
		String password = properties.getProperty("password");
		
		return password;
		
	}

}
