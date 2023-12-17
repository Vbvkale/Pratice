package testngrunner;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class testngpratice {

	
	@BeforeSuite
	public void beforesuite()
	{
		
		System.out.println("Before suite");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before test");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before test");
	}
	
	
	@Test
	public void testtitle()
	{
		
		System.out.println(" test cleared");
		
		AssertJUnit.assertEquals("VBV", "VBV");
		
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Before test");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("Before test");
	}
	

	@AfterSuite
	public void aftersuite()
	{
		
		System.out.println("Before suite");
	}
}
