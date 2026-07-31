package factory;



import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
	
	
	  
	
	public static WebDriver initDriver(String browser)
	{
		WebDriver driver ;
		String browsername  = browser;
		
		switch(browsername)
		{
		case "chrome" :
		{
		    ChromeOptions options = new ChromeOptions();
		    Map<String, Object> prefs = new HashMap<>();
		    prefs.put("credentials_enable_service", false);
		    prefs.put("profile.password_manager_enabled", false);
		    prefs.put("profile.password_manager_leak_detection", false);
		    options.setExperimentalOption("prefs", prefs);
			driver = new ChromeDriver();
			break;
			
		}
		case "edge" :
		{
			driver = new EdgeDriver();
			break;
		}
		default :
		{
			throw new RuntimeException("Browser not supported: " + browsername);
		}
		}
		DriverManager.setDriver(driver);
		return driver;
		
	}
	
	

}
