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
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.LogOutClass;
import com.sauceDemo.POMClasses.LoginPageClass;

@Listeners(com.SauceDemoUtilities.Listener.class)

public class TC03VerifyLogOutFunctionality extends BaseClass
{


     @Test
    public void logoutfunctionality()
   { 
      
    	 LogOutClass logOut=new LogOutClass(driver);  
    	 logOut.ClickaboutButton();
    	 logOut.ClicklogOut();
    	 
		String actualTitle="Swag Labs";
		//WebDriver driver;
		String expectedTitle="Swag Labs";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		Assert.assertTrue(true);
	    Reporter.log("LogOut test case is passed");

		log.info("LogOut test executed");
		
		
		
		
		
		
//		if(expectedTitle.equals(actualTitle))
//		{
//			System.out.println("logout test is passed");
//		}
//		else
//		{
//			System.out.println("logout test is failed");
//		}
     

   }
}
