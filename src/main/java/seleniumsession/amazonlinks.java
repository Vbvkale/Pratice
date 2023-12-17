package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonlinks {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		 driver = new ChromeDriver();
		 elementutil el = new elementutil(driver);

		
		driver.get("https://www.amazon.in/");
		
		By azlinks = By.tagName("a");
		
		// List <WebElement> azlinks =  driver.findElements(By.tagName("a"));
		
		 List<WebElement> getlist =  el.getelements(azlinks);
		
		 for ( WebElement e : getlist)
		 {
			 
			 String linktext = e.getText();
			 
			 if(!linktext.isEmpty())
			 {
			 System.out.println(linktext);
			 }
		 }
		
		 driver.close();

	}

			
			
}