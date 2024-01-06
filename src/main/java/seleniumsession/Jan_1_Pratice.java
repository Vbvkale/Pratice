package seleniumsession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Jan_1_Pratice {
	
	static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws Exception {
	
	
	}
	
	
	public static void Selenium_Method() throws Exception{

		
		driver.navigate().to("");
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		driver.close();
		driver.quit();
		driver.manage().deleteAllCookies();
	driver.manage().window().wait(20);
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		WebElement wb = driver.findElement(By.id("twotabsearchtextbox"));
		
		wb.getText();
		wb.isDisplayed();
		wb.click();
		wb.clear();
		System.out.println(wb.getSize());		
		wb.toString();
		Select sl = new Select(wb);
		
		sl.selectByIndex(1);
		sl.selectByVisibleText("raw");
		sl.selectByValue("12");
		sl.deselectAll();
		sl.deselectByIndex(0);
		sl.deselectByValue("12");
		sl.getFirstSelectedOption();
		sl.getOptions();
		sl.isMultiple();
		sl.getAllSelectedOptions();
		
		Alert al = driver.switchTo().alert();
		
		al.dismiss();
		al.accept();
		al.sendKeys("12");
		al.accept();
		al.getText();
		
		Actions ac = new Actions(driver);
		
			
		
		
	}

}
