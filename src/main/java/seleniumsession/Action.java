package seleniumsession;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {

	public static void main(String[] args) throws Exception {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));
	
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		
		
		driver.navigate().to("https://www.amazon.in/ref=nav_logo");
		
		Actions ac =  new Actions(driver);
		
		Robot rc = new Robot();
		
		rc.keyPress(KeyEvent.VK_SHIFT);
		rc.keyRelease(KeyEvent.VK_SHIFT);
		
		ac.doubleClick();
		
		WebElement we = driver.findElement(By.id("random"));
		
		Select sc = new Select (we);
		
		js.executeScript("argurments[0].click",we);
		
		sc.selectByIndex(2);
		
		Alert al = driver.switchTo().alert();
		
		al.accept();

		driver.switchTo().frame(1);
		
		Set <String> windowid = driver.getWindowHandles();
		
		
		
		
	}

}
