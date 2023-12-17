package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitvsclose {

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();
		
		
		//System.setProperty("webdriver.chrome.driver", "/Users/vaibhavkale/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		
		
	}

}
