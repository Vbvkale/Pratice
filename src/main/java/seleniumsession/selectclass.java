package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass {

	static WebDriver driver;
	
	

	public static void main(String[] args) {

		driver = new ChromeDriver();
		
		elementutil el = new elementutil(driver);

		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();

		By speed = By.id("drop1");
		
		/*
		 * Select ironmanselect = new Select (driver.findElement(speed));
		 * 
		 * // ironmanselect.selectByValue("ghi");
		 * 
		 * 
		 * List<WebElement> ironoption = ironmanselect.getOptions();
		 * 
		 * 
		 * for(WebElement e : ironoption) {
		 * 
		 * System.out.println(e.getText());
		 * 
		 * }
		 * 
		 * driver.close();
		 */
			el.printdropdownoption(speed);
			
		
		
	}
	
		
	

}
