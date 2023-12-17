package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_coding_pratice {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		
		System.out.println("Current Url is : " + driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
		
		

	}

}
