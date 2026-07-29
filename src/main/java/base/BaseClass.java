package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import factory.DriverFactory;
import factory.DriverManager;
import config.ConfigReader;

public class BaseClass {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver = DriverFactory.initDriver(ConfigReader.getInstance().getBrowser());
		driver.get(ConfigReader.getInstance().getUrl());
		
		
		
	}
	
	@AfterMethod
	public void teadDown()
	{
		if(driver != null)
		{
		driver.quit();
		}
	}
	{
		
	}

}
