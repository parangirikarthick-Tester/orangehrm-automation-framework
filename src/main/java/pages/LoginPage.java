package pages;

import org.openqa.selenium.WebDriver;
import common.SeleniumActions;
import pageelements.LoginPageElements;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterUsername(String userName)
	{
		SeleniumActions.sendKeys(driver, LoginPageElements.USERNAME, userName);
	}
	
	public void enterPassword(String password)
	{
		SeleniumActions.sendKeys(driver, LoginPageElements.PASSWORD, password);
	}
	public void clickLoginButtom()
	{
		
		SeleniumActions.click(driver, LoginPageElements.LOGIN_BUTTON);
	}

}
