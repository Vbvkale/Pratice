package testngrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Insuranceanyapratice {
	
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		
			driver = new ChromeDriver();
			
			driver.get("https://demo.guru99.com/insurance/v1/index.php");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();

			System.out.println(driver.getTitle());	
			
			By prof = By.id("user_title");
			By birthyear = By.id("user_dateofbirth_1i");
			By birthmonth = By.id("user_dateofbirth_2i");
			By birthdate = By.id("user_dateofbirth_3i");
			By licenceperiod = By.id("user_licenceperiod");
			By occupation_id = By.id("user_occupation_id");
		
			
			selectdropdown(prof,"Professor");
			selectdropdown(birthyear,"1993");
			selectdropdown(birthmonth,"April");
			selectdropdown(birthdate, "2");
			driver.findElement(By.id("licencetype_f")).click(); 
			selectdropdown(occupation_id,"Doctor");
			
			
			
			driver.findElement(By.id("user_firstname")).sendKeys("Vaibhav");
			driver.findElement(By.id("user_surname")).sendKeys("Kale"); 
			driver.findElement(By.id("user_phone")).sendKeys("98222123456"); 
			driver.findElement(By.id("user_address_attributes_street")).sendKeys("chatrapati chock");
			driver.findElement(By.id("user_address_attributes_city")).sendKeys("PCMC");
			driver.findElement(By.id("user_address_attributes_county")).sendKeys("Bharat");
			driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("412123");
			driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("1varunkalee@gmail.com");
			driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("Varun@123");
			driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("Varun@123");
			driver.findElement(By.xpath("//input[@value='Create']")).click();
			
			//Login page
			
			driver.findElement(By.id("email")).sendKeys("1varunkalee@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Varun@123"); 
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			
			//userprofile
			String signedin = driver.findElement(By.xpath("//h4[1]")).getText();
			String pagetitle = driver.findElement(By.xpath("//div[@id='tabs-1']/h2")).getText();
			
			
			if(signedin.equalsIgnoreCase("1varunkalee@gmail.com"))
			{
				System.out.println("Test case passed for correct user loged in");
				
			}
			
			if(pagetitle.equalsIgnoreCase("Broker Insurance WebPage"))
			{
				System.out.println("Test case passed for correct Page loaded");
				
			}
			
			
			// Request a quotation
			driver.findElement(By.xpath("//a[@id='ui-id-2']")).click();
			
			By Breakdowncover = By.id("quotation_breakdowncover");
			
			selectdropdown(Breakdowncover, "At home");
			
			driver.findElement(By.id("quotation_windscreenrepair_t")).click();
			
			
			driver.findElement(By.id("quotation_incidents")).sendKeys("car accident");
			driver.findElement(By.id("quotation_vehicle_attributes_registration")).sendKeys("MH12 1234");
			driver.findElement(By.id("quotation_vehicle_attributes_mileage")).sendKeys("22");
			driver.findElement(By.id("quotation_vehicle_attributes_value")).sendKeys("1500000"); 
			
			By parking_location = By.id("quotation_vehicle_attributes_parkinglocation");
			selectdropdown(parking_location, "Private Property");
			
			By vehiclebirthyear = By.id("quotation_vehicle_attributes_policystart_1i");
			By vehiclebirthmonth = By.id("quotation_vehicle_attributes_policystart_2i");
			By vehiclebirthdate = By.id("quotation_vehicle_attributes_policystart_3i");
	
			selectdropdown(vehiclebirthyear,"2020");
			selectdropdown(vehiclebirthmonth,"April");
			selectdropdown(vehiclebirthdate, "21");
			driver.findElement(By.xpath("//input[@value='Calculate Premium']")).click();
			
			String premium = driver.findElement(By.xpath("//p[@id='calculatedpremium']")).getText().substring(22,27);			
			System.out.println(premium);
			
			if(premium.equalsIgnoreCase("45030"))
			{
				System.out.println("Calculated premimum test case passed");
			}
			
			driver.findElement(By.xpath("//input[@value='Save Quotation']")).click();
			
			System.out.println(driver.findElement(By.xpath("/html/body/text()")).getText());
			
			

			
			
			
			
			
			
			
//			Select select = new Select(driver.findElement(By.id("user_title")));
//			
//			select.selectByVisibleText("Professor");
//			driver.findElement(By.id("user_firstname")).sendKeys("Vaibhav");
//			driver.findElement(By.id("user_surname")).sendKeys("Kale"); 
//			driver.findElement(By.id("user_phone")).sendKeys("98222123456"); 
//			
//			Select select1 = new Select(driver.findElement(By.id("user_dateofbirth_1i")));	
//			select.selectByVisibleText("1993");
//			
//			Select select2 = new Select(driver.findElement(By.id("user_dateofbirth_2i")));	
//			select.selectByVisibleText("April");
//			
//			Select select3 = new Select(driver.findElement(By.id("user_dateofbirth_3i")));	
//			select.selectByVisibleText("2");
//			
//			driver.findElement(By.id("licencetype_f")).click(); 
//		
//			Select select4 = new Select(driver.findElement(By.id("user_licenceperiod")));	
//			select.selectByVisibleText("10");
			
		
			
			
	}
	
	
	public static void selectdropdown(By locator, String str)
	{
		
		WebElement option = driver.findElement(locator);
		
		Select select = new Select(option);
		
		select.selectByVisibleText(str);
		
		
	}
	
	
	
	

}
