package newConcepts;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AddExtensions 
{
	@Test
	public void addExtentions()
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addExtensions(new File("C:/Users/harshitpc/Downloads/calculatorCRX.crx"));
		opt.addArguments("--disable-infobars ");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.google.com");
	}
}
