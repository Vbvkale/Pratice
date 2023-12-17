package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectwithoutselecttag {

static WebDriver driver;
	

	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dress for men");
		
		List <WebElement>  search = driver.findElements(By.xpath("//div[@class = \"nav-issFlyout nav-flyout\"]//div[@class"
								+ " = \"s-suggestion s-suggestion-ellipsis-direction\"]"));
		
			for(WebElement e : search) {
				
				
				//System.out.println(e.getText());
				
				
				  if(e.getText().equals("dress for men stylish latest"));
				  
				  e.click(); break;
				
			}
			
			 String check = driver.findElement(By.xpath("//span[@class = \"a-size-base a-color-secondary a-text-normal\"]")).getText();
			 
			 if(check.equalsIgnoreCase("Price and other details may vary based on product size and colour."))
			 {
				 System.out.println("The loaded page is correct");
			 }
		
		driver.close();
		
	}

}
