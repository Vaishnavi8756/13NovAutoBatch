package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.sauceDemo.POMClasses.AddToCartProduct;
import com.sauceDemo.POMClasses.LogOutClass;
import com.sauceDemo.POMClasses.LoginPageClass;

public class BaseClass 
{
	WebDriver driver;
	LoginPageClass login;
	AddToCartProduct home;

		
		@BeforeClass
		public void setUpMethod()
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\user\\eclipse-workspace\\SauceDemoApplicationProject1\\chromedriver.exe");
			
			driver =  new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			System.out.println("URL is opened");
		}
		
		@BeforeMethod
		public void loginMethod()
		{
			login = new LoginPageClass(driver);
			 login.sendUserName();
		        login.sendpassWord();
		        login.ClickLoginButton();
		}	
		
		@AfterMethod
		public void logOutMethod()
		{ 
		LogOutClass product=new LogOutClass(driver);
        product.ClickaboutButton();
        //
        //Thread.sleep(3000);
        product.ClicklogOut();
       // Thread.sleep(3000);
       
		}	
			
		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}	

}
