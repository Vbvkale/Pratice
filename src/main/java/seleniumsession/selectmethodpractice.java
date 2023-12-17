package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectmethodpractice {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/selectmenu/");
		
		driver.manage().window().maximize();

		By speed = By.id("speed");
		
		// By speedalloption = By.xpath("//select[@id=\"speed\"]/option");

		Select speedselect = new Select(driver.findElement(speed));

		 speedselect.selectByVisibleText("Faster");

	
			/*
			 * List<WebElement> speedoption = speedselect.getOptions();
			 * 
			 * 
			 * for(WebElement e : speedoption) { List <String> getoptionstring = new
			 * ArrayList<String>();
			 * 
			 * getoptionstring.add(e.getText());
			 * 
			 * System.out.println(getoptionstring); driver.close();
			 * 
			 * }
			 */
			 
		 

	}

}
