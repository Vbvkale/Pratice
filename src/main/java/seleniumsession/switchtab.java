package seleniumsession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtab {

	static WebDriver driver = new ChromeDriver();
	static elementutil ele = new elementutil(driver);

//	public switchtab(elementutil ele) {
//		
//		this.ele = ele;
//	}

	public static void main(String[] args) {

		driver.get("https://demoqa.com/browser-windows");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		// ele.getelement(By.id("twotabsearchtextbox")).sendKeys("Samsung S23 Ultra");

		
		ele.getelement(By.xpath("//div[@id='browserWindows']//button[@id='tabButton']")).click();
		String mainwindow = driver.getWindowHandle();

		Set<String> Allwindowid = driver.getWindowHandles();
		Iterator<String> itr = Allwindowid.iterator();

		while (itr.hasNext()) {

			String childwindow = itr.next();
			if (!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println(driver.getCurrentUrl());
				System.out.println(ele.getelement(By.xpath("//h1[@id='sampleHeading']")).getText());
				driver.close();
			}

		}
		driver.switchTo().window(mainwindow);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
