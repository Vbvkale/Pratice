import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class praticetestngtitle {
	
	
	public WebDriver driver;
	
	@BeforeTest
	public void beforetestmethod()
	{
		
		 driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.get("https://www.amazon.in/ref=nav_logo");	
		
	}
	
	@Test
	public void Titletest()
	{
		assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	System.out.println(driver.getTitle());
		
	}
	
	@AfterTest
	public void aftertestmethod()
	{
		
		driver.quit();
		
		
	}
}
