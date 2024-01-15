package seleniumsession;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fibonacci {
	
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		
	
		
		
		
		
	}
	
	public static void wait1() {
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		js.executeScript("window.ScrollBy(0,1000)");
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("as"))));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("as"))));
	}
	
	
	
	public static void listpratice() {

		List<String> list = new ArrayList<String>();

		list.add("vaibhav");
		list.add("Nagnath");
		list.add("kale");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		for (String e : list) {

			System.out.println(e);

		}
	}

	public static void pal() {

		String str = "alevela";
		int j = str.length() - 1;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == str.charAt(j)) {
				j--;

				if (j == 1) {

					System.out.println("The String is palendrom");
					break;
				}
			} else {

				System.out.println("The string is not palendrom");
				break;
			}

		}
	}

	public static void oddno() {
		int a[] = { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		int count = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {

				// System.out.println(a[i]+" The number is odd");
				count = count + 1;

			}

		}

		System.out.println(count);

	}

	public static void febo() {

		int a = 5;
		int temp = 0;
		int feb = 1;

		for (int i = 0; i < a; i++) {

			System.out.print(" " + temp);

			int c = temp + feb;
			temp = feb;
			feb = c;
		

		}
		// 0 1 1 2 3 5
	}

}
