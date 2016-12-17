package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InitClass implements AutomationConstants {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}

}
