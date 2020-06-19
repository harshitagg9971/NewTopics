package newConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDropDown 
{
	@Test
	public void bootstrapDropdown() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/harshitpc/Downloads/BootstrapDropDown.html");
		driver.findElement(By.xpath("//button")).click();
		List<WebElement> options = driver.findElements(By.xpath("//ul/li/a"));
		System.out.println(options.size());
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		for(int i=0;i<options.size();i++)
		{
			if(options.get(i).getText().equalsIgnoreCase("html"))
			{
				//options.get(i).click();
				break;
			}
		}
		
		for(int i=0;i<options.size();i++)
		{
			WebElement element =  options.get(i);
			String innerHTML = element.getAttribute("innerHTML");
//			if(innerHTML.contains("CS"))
//			{
//				element.click();
//				break;
//			}
			
			if(innerHTML.contentEquals("CSS"))
			{
				element.click();
				break;
			}
		}
	}
}
