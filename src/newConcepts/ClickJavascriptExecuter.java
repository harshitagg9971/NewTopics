package newConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickJavascriptExecuter 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		//driver.findElement(By.id("persistent")).click(); 	---->ElementNotVisibleException
		
		//WebElement checkbox=driver.findElement(By.xpath("//input[@id='persistent']"));
		WebElement checkbox=driver.findElement(By.id("persistent"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",checkbox);
		
		WebElement next=driver.findElement(By.xpath("//input[@type='submit']"));
		js.executeScript("arguments[0].click()",next);
	}
}
