package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class interview_practice {
	
	
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {

		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@placeholder = \"Search Amazon.in\"]")).sendKeys("Samsung Mobile");
		
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();

				



	}

}
