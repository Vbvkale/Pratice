package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverbasic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vaibhavkale/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://release.evalue8.it/widget_dashboard");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if (title.equals("Log in to ARTUS PROTECT1"))
		{
			System.out.println("The test case is passed");
		}
		else 
		{
			System.out.println("Test case is failed");
			
		}
		
		driver.quit();

	}

}
