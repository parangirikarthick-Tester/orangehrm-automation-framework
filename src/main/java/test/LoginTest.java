package test;

import org.testng.annotations.Test;
import base.BaseClass;
import pages.LoginPage;
import config.ConfigReader;

public class LoginTest extends BaseClass {

    @Test
    public void testValidLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        
        System.out.println("Current URL: " + driver.getCurrentUrl());
        
        
        loginPage.enterUsername(ConfigReader.getInstance().getUserName());
        
        loginPage.enterPassword(ConfigReader.getInstance().getPassword());
       
        loginPage.clickLoginButtom();

        System.out.println("Page title after login: " + driver.getTitle());
    }
}
