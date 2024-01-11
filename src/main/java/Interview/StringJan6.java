package Interview;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StringJan6 {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		
		

	}

	public static void dragdrop() {

		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));

		Actions ac = new Actions(driver);

		WebElement source = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement destination = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));

		ac.dragAndDrop(source, destination);

	}

	public static void scroll() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("docuememt.getElementById('textid').value='new value'");

		js.executeScript("window.ScrollBy(0,1000)");
		js.executeScript("window.ScrollBy(0,1000)");
	}

	public static void WaitPratice() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("")));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("asd"))));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	public static void arryList() {

		ArrayList<Object> al = new ArrayList<Object>();

		al.add("vaibhav");
		al.add(12);
		al.add(32.23);
		al.add("kale");

		for (Object e : al) {

			System.out.println(e);
		}
	}

	public static void findspace() {

		String str = "vaibhav nagnath kale and i am testing carrer ";
		int space = 0;

		char s[] = str.toCharArray();

		for (int i = 0; i < s.length - 1; i++) {

			if (Character.isAlphabetic(s[i]) && s[i + 1] == ' ') {

				space++;

			}

		}

		System.out.println("Total spaces in string is : " + space);
	}

	public static void Stringrev() {

		String str = "vaibhav nagnath kale";

		// StringBuilder sc = new StringBuilder(a);

		// System.out.println(sc.reverse());

		String a[] = str.split(" ");

		for (String e : a) {

			StringBuilder sc = new StringBuilder(e);
			System.out.print(" " + sc.reverse());
		}
	}

}
