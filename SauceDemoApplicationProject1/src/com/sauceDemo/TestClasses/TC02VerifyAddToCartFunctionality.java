package com.sauceDemo.TestClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.AddToCartProduct;
import com.sauceDemo.POMClasses.LoginPageClass;

public class TC02VerifyAddToCartFunctionality extends BaseClass
{
public static WebDriver driver;
	
//	static void screenshotMethod(WebDriver driver) throws IOException
//	{
//		Date date=new Date();
//		DateFormat d= new SimpleDateFormat("MM-dd-yy  & HH-mm-ss" );
//		String newDate= d.format(date);
//	
//       TakesScreenshot ts = (TakesScreenshot)driver;
//    	
//    	File source = ts.getScreenshotAs(OutputType.FILE);
//    	
//    	File dest = new File("C:\\Users\\user\\Downloads\\Screenshot\\" + newDate +".jpg");
//    	
//    	FileHandler.copy(source, dest);
//    	
//    	System.out.println(" Screenshot Has Been Taken");
//    	
//	
//}
//	public static void main(String[] args) throws IOException, InterruptedException 
//	{
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\SauceDemoApplicationProject1\\chromedriver.exe")	;	
//		driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			System.out.println("Broser open successfully");
//			driver.get("https://www.saucedemo.com/");
//			System.out.println("url open successfully");
//	        Thread.sleep(3000);	
//		
//	       
//        LoginPageClass login=new LoginPageClass(driver);
//	        
//	        login.sendUserName();
//	        login.sendpassWord();
//	        login.ClickLoginButton();
//	        
//	        
	        @Test
	        
	        public void addtoCartFunctionality()
	        {
	        	System.out.println("product add to cart successfully");
	        }
//	    AddToCartProduct product=new AddToCartProduct(driver);
//	        
//	        product.Clickitem();
//	        product.clickAddtoCart();
//	        Thread.sleep(3000);
//	        System.out.println("product are added to cart");
//		
////	        String actualTitle="Swag Labs";
//		String expectedTitle=driver.getTitle();
//		
//		if(expectedTitle.equals(actualTitle))
//		{
//			System.out.println("login test is passed");
//		}
//		else
//		{
//			System.out.println("login test is failed");
//		}
//      
//		
//		
//		TC02VerifyAddToCartFunctionality.screenshotMethod(driver);
//		System.out.println("TC02AddToCartFunctionality Screenshot Has Been Taken");
//
//		System.out.println("Testing completed");
//
//		driver.close();
//		
//		
//		
		
	}


