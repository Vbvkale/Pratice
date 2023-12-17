package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration_case_pratice {

	public static void main(String[] args) {
		
		
		browserutl br = new browserutl();
		
		WebDriver driver = br.driverinit("chrome");
		
		elementutil el= new elementutil(driver);
		
		br.launchUrl("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		br.maxbrowser();
		

		WebElement firstname = driver.findElement(By.id("input-firstname"));
		
		firstname.sendKeys("vaibhav");
		
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By submit = By.cssSelector("submit");
	
		el.getelement(lastname).sendKeys("kale");
		
		el.dosendkeys(email, "vaibhav1200@gmail.com");
		driver.findElement(submit).click();

	}

}
