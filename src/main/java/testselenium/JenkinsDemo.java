package testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinsDemo{
	
	
	@Test

    	public void runSelenium() {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");

        driver.quit();
	}

}