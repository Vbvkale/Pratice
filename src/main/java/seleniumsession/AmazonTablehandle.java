package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTablehandle {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
			
			
			 driver =  new ChromeDriver();
			
			driver.get("https://www.amazon.in/ref=nav_logo");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung mobile");
			
			driver.findElement(By.id("nav-search-submit-button")).click();
			
			Thread.sleep(3000);
			
			
			 
			int i = 0;
			//Samsung Galaxy A34 5G (Awesome Graphite, 8GB, 256GB Storage) | 48 MP No Shake Cam (OIS) | IP67 | Gorilla Glass 5 | Voice Focus | Travel Adapter to be Purchased Separately
			
			/*
			 * for(WebElement e : mobilelist){ List<String> mobstr = new ArrayList();
			 * mobstr.add(e.getText()); }
			 */
			
			
			while(true)
			{
				
				List<WebElement> mobilelist = driver.findElements(By.xpath("//div[@class=\"sg-col-inner\"]//span[@class = "
						+ "\"a-size-medium a-color-base a-text-normal\" or @class= \"a-price-whole\"]"));
				
				  
					  	if(driver.findElements(By.xpath("//span[contains(text(),\"Samsung Galaxy A34 5G (Awesome Graphite, 8GB, 256GB Storage) | \")]")).size()==1)
						{
					  		
					  		driver.findElement(By.xpath("//span[contains(text(),\"Samsung Galaxy A34 5G (Awesome Graphite, 8GB, 256GB Storage) | \")]")).click();
						
					  		break;
						}
					  	else {
					  		
					  		driver.findElement(By.xpath("//a[contains(text(),\"Next\")]")).click();
					  		
					  		Thread.sleep(3000);
							
					  	}
					  	
					  	
					  	i++;
				  
				  
				
				
				
				
			}
			
			
			
			
	}

}
