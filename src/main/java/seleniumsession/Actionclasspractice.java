package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionclasspractice {

static WebDriver driver;
	

	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, null);
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.manage().window().maximize();
		
		

		WebElement menu = driver.findElement(By.xpath("//span[@class = \"nav-line-2 \"]"));
		
		WebElement yourwishlink = driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[3]"));
		
		
		
		Actions action = new Actions(driver);
		
		
		
		Actions ac =  new Actions(driver);
		
		ac.moveToElement(menu).perform();
		yourwishlink.click();
		
		
		
		
		
	
	
	
	
	
	}

}
