package config;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;

public class TestConfigReader {

	public static void main(String[] args) {
        WebDriver driver = DriverFactory.initDriver("chrome");
        driver.get("https://opensource-demo.orangehrmlive.com");
        System.out.println(driver.getTitle());
        driver.quit();

	}

}
