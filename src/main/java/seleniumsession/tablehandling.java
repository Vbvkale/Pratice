package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablehandling {
	
	
	static WebDriver driver;

public static void main(String[] args) throws Exception {
		
		
		 driver =  new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
	
		/*
		 * List<WebElement> tableele = driver.findElements(By.
		 * xpath("//a[contains(text(),\"Jet Airways\")]/ancestor::tr/child::td"));
		 * 
		 * 
		 * for(WebElement e : tableele) {
		 * 
		 * System.out.println(e.getText());
		 * 
		 * }
		 */
		
		getdetails("Chennai Petro.");
		
		driver.close();	
	}



	public static void getdetails(String name) {
	

		
		String name1 = "//a[contains(text(),\""+name+"\")]/ancestor::tr/child::td";
		
		List<WebElement> tableele = driver.findElements(By.xpath(name1));
		
		
		for(WebElement e : tableele)
		{
			
			System.out.println(e.getText());
			
		}
		
		
	
	
}

}
