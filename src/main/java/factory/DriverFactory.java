package factory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
