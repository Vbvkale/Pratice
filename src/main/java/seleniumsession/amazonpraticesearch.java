package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonpraticesearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s23 ultra");
		
		List <WebElement> searchresult = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		
		for( WebElement e : searchresult) {
			
			if(e.getText().equalsIgnoreCase("samsung s23 ultra")) {
				
				e.click();
				break; 
			}
			}
			//   
		
		
		
		while(true) {
			
			
			List <WebElement> phonesresults = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//h2"));		
			
			
				
				if(driver.findElements(By.xpath("//span[contains(text(),'Samsung Galaxy Z Flip5 5G (Mint, 8GB RAM, 256GB Storage)')]")).size()==1) {
					
					driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy Z Flip5 5G (Mint, 8GB RAM, 256GB Storage)')]")).click();
					
					break; 
				}
				else
				{
					
					WebElement next = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
					Thread.sleep(3000);
					
					next.click();
					
				}
				
				
			
			
			
			
		}
		
		
		
		
		
	}

}
