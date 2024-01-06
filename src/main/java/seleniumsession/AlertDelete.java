package seleniumsession;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDelete {

	
	static WebDriver driver = new ChromeDriver();
	
	@Test
	public static void alert() {
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("cusid")).sendKeys("12", Keys.ENTER);
		Alert al = driver.switchTo().alert();
		al.accept();
		Alert all = driver.switchTo().alert();
		String alstring = all.getText();
		String actual = "Customer Successfully Delete!"	;
		Assert.assertEquals(alstring, actual);
		all.accept();
	
		
	}
	

}
