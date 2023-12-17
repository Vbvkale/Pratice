package seleniumsession;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class artuspraticetestcase {

public static void main(String[] args) throws Exception {
		
		
		WebDriver driver =  new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://release.evalue8.it/widget_dashboard");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@class = \"social-link-style\"]")).click();
		
		/*
		 * Set <String> windoid = driver.getWindowHandles();
		 * 
		 * List<String> listid = new ArrayList(windoid);
		 * 
		 * String parentid = listid.get(0);
		 * 
		 * String childid = listid.get(1);
		 * 
		 * String grandchild = listid.get(2);
		 * 
		 * driver.switchTo().window(childid);
		 */
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("i0116")).sendKeys("rcstest01@artus-protect.de");
		
		driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
		
		//driver.switchTo().window(grandchild);
		Thread.sleep(5000);
		
		driver.findElement(By.id("i0118")).sendKeys("Rcs@2024@1");
		
		
		//Actions ac = new Actions(driver);
		
		
		Thread.sleep(5000);
			
		
		driver.findElement(By.id("idSIButton9")).click();
		
		
		
		/*
		 * Actions ac = new Actions(driver);
		 * 
		 * ac.click(driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]"))).build().
		 * perform();
		 */
		
			//Thread.sleep(5000);
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()=\" Welcome, \"]"))));
		
		WebElement welcomeele= driver.findElement(By.xpath("//span[text()=\" Welcome, \"]"));
		
			String welcome = welcomeele.getText();
			
			System.out.println(driver.getTitle());
			
				//driver.findElement(By.xpath("//span[text()=\" Welcome, \"]")).getText();
		
		
		  if(welcome.equals("Welcome,")) {
		  System.out.println("Login Test case passed"); }
		 
		
		
		
		// in this test case for login i have used wait class to pratice 
		
		
		
		
		

	}

}
