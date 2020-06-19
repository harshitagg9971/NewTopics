package newConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageLoadTimeout 
{
	@Test
	public void pageLoadTimeout()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);// this ensures the should be loaded within 10 seconds
		driver.get("https://www.myntra.com");
		System.out.println(driver.getTitle());
	}
}
