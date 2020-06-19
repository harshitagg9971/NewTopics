package newConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.testng.annotations.Test;

public class KillUnusedWindowProcesses 
{
	@Test
	public void killUnusedWindowProcesses()
	{
		WindowsUtils.killByName("chromedriver.exe");
		WindowsUtils.killPID("184");
		System.out.println(WindowsUtils.getProgramFiles86Path());
		System.out.println(WindowsUtils.getProgramFilesPath());
		System.out.println(WindowsUtils.loadEnvironment());
	}
}
