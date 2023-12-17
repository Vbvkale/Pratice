package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitpratice {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, null);
		
		
		
		
		//wait.until(ExpectedConditions.visibilityOf(null))
		
		
		
		
		
		
		
	}

}
