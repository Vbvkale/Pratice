package seleniumsession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) {
		
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("selenium143")).click();
		
		Set <String> windoid = driver.getWindowHandles();
		
		List<String> listid = new ArrayList(windoid);
		
		String parentid = listid.get(0);

		String childid = listid.get(1);
		
		driver.switchTo().window(childid);
		
		System.out.println("child window Id :  " + childid);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentid);
		
		System.out.println("Parent window Id :  " + parentid);
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		
		

	}

}
