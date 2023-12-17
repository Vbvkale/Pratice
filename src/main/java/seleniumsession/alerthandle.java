package seleniumsession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alerthandle {

static WebDriver driver;
	

	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alert1")).click();
		
		Alert al = driver.switchTo().alert();
		
		String s = al.getText();
		
		System.out.println("Alert String : " + s);
		
		Thread.sleep(5000);
		
		if(s.equals("Hello"))
		{
			al.dismiss();
		}
		
		System.out.println("Alert dismissed successfully");
		
		driver.close();

	}

}
