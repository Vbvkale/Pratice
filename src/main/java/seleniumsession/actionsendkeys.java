package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class actionsendkeys {

static WebDriver driver;
	

	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(10000);
		
		WebElement email = driver.findElement(By.id("input-email"));
		
		
		WebElement password = driver.findElement(By.id("input-password"));
		
		Actions ac = new Actions(driver);
		
		//ac.dragAndDrop(drag, drop).perform();
		
		ac.sendKeys(email, "vaibhav1203@gmail.com").perform();
		ac.sendKeys(password, "1234").perform();
		ac.click(driver.findElement(By.xpath("//*[@id=\"form-login\"]/button"))).perform();
		
		System.out.println("performed all the operation");
		driver.close();
		
		
		
		

	}

}
