package Interview;

import java.time.Duration;
import java.util.*;
import java.util.regex.Pattern;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StringJan6 {

	static WebDriver driver;

	public static void main(String[] args) {
		
		
		
		

	}

	public static void intostring() {

		String s = "123";

		char v[] = s.toCharArray();

		int v1 = Integer.parseInt(s);

		int b = 2;

		System.out.println(v1 + b);

	}

	public static void Anagram() {

		String str1 = "silent", str2 = "listen";
		int count = 0;

		if (str1.length() != str2.length()) {

			System.out.println("The String is not anagrams ");

		} else if (str1.length() == str2.length()) {

			for (int i = 0; i < str1.length(); i++) {

				for (int j = 0; j < str1.length(); j++) {
					if (str1.charAt(i) == str2.charAt(j)) {

						count++;
						break;

					}
				}

			}

			if (count == str1.length()) {

				System.out.println("The String is anagrams");
			} else {

				System.out.println("The String is not anagrams");

			}

		}
	}

	public static void palendrom() {

		String str = "kadak";
		String temp = "";

		char s[] = str.toCharArray();

		for (int i = str.length() - 1; i >= 0; i--) {

			temp = temp + s[i];

			// System.out.println(s[i]);
		}

		// System.out.println(temp);

		if (temp.equals(str)) {

			System.out.println("The string is Palendrom");
		} else {

			System.out.println("The string is not a Palendrom");
		}

	}

	public static void act() {

		Actions action = new Actions(driver);

		WebElement ck = driver.findElement(By.xpath("askdh"));

		action.contextClick(ck);
		action.build().perform();

	}

	public static void prime() {

		int i, prime = 7;
		int flag = 0;

		if (prime == 0 || prime == 1) {

			System.out.println("The number is not a prime no");
		} else {

			for (i = 2; i <= (prime / 2); i++) {

				if (prime % i == 0) {

					System.out.println("The number " + prime + " is not a prime number");
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				System.out.println("The number " + prime + " is prime number ");

			}

		}

	}

	public static void fibo() {

		// driver = new ChromeDriver();

		// 0 1 1 3 5 7 13.

		int num1 = 0, num2 = 1;
		int fibo = 5;

		System.out.print(num1 + "  " + num2);

		for (int i = 2; i <= fibo; i++) {

			int temp = num1 + num2;

			System.out.print(" " + temp);
			num1 = num2;
			num2 = temp;

		}
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

		// driver.wait(Duration.ofSeconds(30));
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
