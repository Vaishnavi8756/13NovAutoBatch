package com.sauceDemo.TestClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.SauceDemoUtilities.ScreenShot;
import com.sauceDemo.POMClasses.AddToCartProduct;
import com.sauceDemo.POMClasses.LogOutClass;
import com.sauceDemo.POMClasses.LoginPageClass;

public class BaseClass
{
	WebDriver driver;
	LoginPageClass login;
	//AddToCartProduct home;
    Logger log;
	@Parameters("browserName")
	
		@BeforeMethod
		public void setUpMethod(String browserName)
		{
			if(browserName.equals("Chrome"))
			{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			driver =  new ChromeDriver();
			}
			else if(browserName.equals("edge"))
			{
				 System.setProperty("webdriver.edge.driver","C:\\Users\\user\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			
			    driver =  new EdgeDriver();
			}
			else {
				System.out.println("thrown error");
			}
			
//			
			log = Logger.getLogger("SauceDemo1");
			PropertyConfigurator.configure("log4j.properties");
			
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			System.out.println("Browser is opened");
		
	
        login = new LoginPageClass(driver);
			 login.sendUserName();
			log.info("UserName entered");
		       
			 login.sendpassWord();
			log.info("Password Entered");
		    
			 
			 login.ClickLoginButton();
			log.info("clicked on login button");
		}	
		
//		@AfterMethod
//		public void logOutMethod()
//		{ 
//		LogOutClass product=new LogOutClass(driver);
//        product.ClickaboutButton();
//        //
//        //Thread.sleep(3000);
//        product.ClicklogOut();
//       // Thread.sleep(3000);
//       
//		}	
//			
		
		
		
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}	

}
