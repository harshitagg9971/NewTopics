package newConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyErrorMessage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("(//span[.='Next'])[1]")).click();
		WebElement error=driver.findElement(By.xpath("//div[@class='o6cuMc']"));
		//String actualerrormsg=error.getText();
		String actualerrormsg=error.getAttribute("innerHTML");
		String expectederrormsg="Enter an email or phone number";
		//Assert.assertEquals(actualerrormsg, expectederrormsg);
		Assert.assertTrue(actualerrormsg.contains("Enter an email"));
		System.out.println("test completed");
	}
}
