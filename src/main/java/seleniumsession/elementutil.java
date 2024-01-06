package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class elementutil {

	public WebDriver driver;

	public elementutil(WebDriver driver) {
	
		this.driver = driver;
	}

	 public WebElement getelement(By locator) {
		
		return driver.findElement(locator);

	}
	 
	 public List<WebElement> getelements(By locator)
		{
			
		 return driver.findElements(locator);
		 }
	
	public String gettext(By locator) {
		
		return getelement(locator).getText();
	}

	public void dosendkeys(By locator, String value)
	{
		getelement(locator).sendKeys(value);
		
	}
	
	public void doclick(By locator)
	{
		getelement(locator).click();
		
	}
	
	/**
	 * This is select method utilities////////////////////
	 */
	
	public void printdropdownoption( By locator) {
		 
		 dodropdownoption(locator).stream().forEach(e -> System.out.println(e));
		 
	}
	
	public  List <String> dodropdownoption(By locator)
	{
		
		WebElement option = driver.findElement(locator);
		
		Select select = new Select(option);
		
		List <WebElement> getoptiondropdown = select.getOptions();
		
		List <String> getoptionstring = new ArrayList<String>();
		
		 for(WebElement e : getoptiondropdown) { 
			 
				
				  getoptionstring.add(e.getText());		 
				 
		 }
		 return getoptionstring;
		
	}
	
	 

	
	
	
}
