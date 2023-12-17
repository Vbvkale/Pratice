package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserutl {

	public WebDriver driver;

	public WebDriver driverinit(String browsername)
	{
	
		
		switch(browsername.toLowerCase())
		{
		case "chrome" : 
			 driver = new ChromeDriver();
			break;
			
		case "safari" : 
			 driver = new ChromeDriver();
			break;
			
		case "firefox" : 
			 driver = new ChromeDriver();
			break;
			
			default :
				System.out.println("Kindly pass correct browser name...");
			
		}
		
		return driver;
			

	}
	
	public void launchUrl(String url)
	{
		if(url == null)
			return ;
		if(url.isEmpty())
			return;
		
		driver.get(url);
		
	}
	
	public String getpageurl()
	{
		return driver.getCurrentUrl();
	}
	
	public String gettitle()
	{
		
		return driver.getTitle();
	}
	
	public void closebrowser()
	{
		
		driver.close();
	}
	
	public void quitbrowser()
	{
		driver.quit();
		
	}
	
	public void maxbrowser()
	{
		driver.manage().window().maximize();
		
	}
	

}
