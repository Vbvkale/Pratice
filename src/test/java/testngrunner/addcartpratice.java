package testngrunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class addcartpratice {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		
		// WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://demo.guru99.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[contains(text(),\"Payment Gateway Project\")]")).click();
		
		Thread.sleep(3000);
		
		
		String frame = driver.switchTo().frame(driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0"))).getTitle();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"ad_iframe\"]")));
		
		driver.findElement(By.xpath("//span[contains(text(),\"Close\")]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"nav\"]/a[2]")).click();
		
		// webelemetn list xpth = 
		
		Set <String> windoid = driver.getWindowHandles();
		
		List<String> listid = new ArrayList(windoid);
		
		String parentid = listid.get(0);

		String childid = listid.get(1);
		
		driver.switchTo().window(childid);
		
		//List<WebElement> card_data = driver.findElements(By.xpath("//h4[@style ='text-align:center;font-size:24px;font-weight:400;"
		//		+ "color:#555;line-height:36px;']"));
		
		ArrayList<Object> str = new ArrayList<Object>(); // need to 
		
		for(int i=1;i<5;i++) {
			
		str.add(driver.findElement(By.xpath("//h4[@style ='text-align:center;font-size:24px;font-weight:400;"
				+ "color:#555;line-height:36px;']["+i+"]")).getText());
			
			System.out.println(str.get(i));
			
		}
		
		
		
	//	for(WebElement e : card_data) {
			
	//		System.out.println(e.getText()); }
			
	
		

		
		
		
		

	}

}
