package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Largest_number {
	static int max;

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
			
	
		
		
		List<Object> raw = new ArrayList();
		
		raw.add(12);
		
		raw.add("vaibhav");

		raw.add(13);

		raw.add(14);

		raw.add(16);
		
		raw.size();
		
		
		for (Object e : raw) {
			
			System.out.println(e);
		}
		
		System.out.println(raw.size());
	

		largestno();
		System.out.println("Maxmum no in array is : " + max);

		evenodd();
			
		comparestring("Vaibhav", "vaibhav");
		
		//reverse();
		
		
		revno();
	}

	
	public static void revno() {
		
		
		int x =110;
		
		String no = Integer.toString(x);
		
		System.out.println(no);
		
		for(int j=no.length()-1;j>=0;j--) {
			
			System.out.print(no.charAt(j));
			
		}
		
		
		
	}
	
	
	
	
	public static void reverse() {
		
		String statment = "I love java and selenium";
		
		//String rev= "";
		
		//String words[] = statment.split(" ");
		
		for( int i = statment.length(); i > 0; i--) {
			
			System.out.print(statment.charAt(i-1));
			
		}

		
	}
	
	
	
	
	public static void comparestring(String s1, String s2) {

		if (s1.equalsIgnoreCase(s2)) {

			System.out.println(" String  " + s1 + " is equals to String " + s2);
		} else
			System.out.println(" String  " + s1 + " is NOT equals to String " + s2);

	}

	public static void evenodd() {

		int a = 0;

		if (a % 2 != 0) {

			System.out.println("Given number odd");

		} else
			System.out.println("The number even");

	}

	public static int largestno() {

		int a[] = { 10, 20, 30, 60 };

		max = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];
			}

		}

		return max;

	}

}
