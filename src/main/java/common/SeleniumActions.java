package common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumActions {
	
	private static void waitForElement(WebDriver driver,By locator)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	private static By getBy(LookupDetails element) {
		String type = element.getLocatorType();
		String value = element.getLocatorValue();
		
		switch(type)
		{
		case "xpath" :
			return By.xpath(value);
			
		case "id" :
			return By.id(value);
			
		case "name" :
			return By.name(value);
			
		case "css" :
			return By.cssSelector(value);
			
			default : 
				throw new RuntimeException ("requested type of locator is not supported" + type);
		
		}
		
	}
	
	public static void click(WebDriver driver, LookupDetails element) {
		 By locator = getBy(element);
		 waitForElement(driver, locator);
         driver.findElement(locator).click();
    }

    public static void sendKeys(WebDriver driver, LookupDetails element, String text) {
        By locator = getBy(element);
        waitForElement(driver, locator);
        driver.findElement(locator).sendKeys(text);
    }
    
    public static void verifyAssert(WebDriver driver,LookupDetails element,String expected)
    {
    	By locator = getBy(element);
    	waitForElement(driver, locator);
    	String actual = driver.findElement(locator).getText();
    	Assert.assertEquals(actual, expected, "expected text is not found and login failed");
    	
    }

}
