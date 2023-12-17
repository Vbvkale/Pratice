package seleniumsession;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.Multiplication;

public class anyapraticedragdrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz.html");
		driver.manage().window().maximize();
		
		
		//
		
		List<WebElement> multilication = driver.findElements(By.xpath("//div[@id=\"questionDiv\"]//div[@class=\"dragDropSmallBox\"]"));
		
		List<String> multivalue =new ArrayList<>();

//	for(WebElement e : multilication) {
//		
//		System.out.println(multivalue.add(e.getText().substring(2)));
//	}
		
		
		for(int i = 1; i<=10;i++) {
			
			driver.findElement(By.xpath("//div[@id=\"questionDiv\"]//div[@class=\"dragDropSmallBox\" and @id  =\"q"+i+"\"]")).getText().substring(2);
			
			
			
		}
		driver.quit();
	
		
			
		
		
		

	}

}
