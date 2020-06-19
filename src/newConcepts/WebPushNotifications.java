package newConcepts;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class WebPushNotifications 
{
	@Test
	public void webPushNotifications()
	{
		/*
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		opt.addArguments("--disable-infobars");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.redbus.in/");*/
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxOptions opt = new FirefoxOptions();
		
		opt.addPreference("dom.notifications.enabled", false);
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("https://www.redbus.in/");
	}
}
