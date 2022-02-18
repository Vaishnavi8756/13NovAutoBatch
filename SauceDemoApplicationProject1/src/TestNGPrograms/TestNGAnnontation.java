package TestNGPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnontation 
{
	@BeforeSuite
	   public void beforeSuiteMethod() 
	   {
		  System.out.println("before suite"); 
	   }
	   
	   @BeforeTest
	   public void beforeTestMethod() 
	   {
		   System.out.println("before test");
	   }
	   
	   @BeforeClass
	   public void beforeClassMethod() 
	   {
		   System.out.println("before class");
	   }
	   
	   @BeforeMethod
	   public void beforeMethod() 
	   {
		   System.out.println("before method");
	   }
	   
	   @Test
	   public void testMethod() 
	   {
		   System.out.println("In a test case");
	   }
	   
	   @Test
	   public void testMethod1() 
	   {
		   System.out.println("In a test case");
	   }

	   @AfterMethod
	   public void afterMethod() 
	   {
		   System.out.println("after method");
	   }
	   
	   @AfterClass
	   public void afterClassMethod() 
	   {
		   System.out.println("after class");
	   }
	   

}
