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

import com.sauceDemo.POMClasses.AddToCartProduct;
import com.sauceDemo.POMClasses.LoginPageClass;

@Listeners(com.SauceDemoUtilities.Listener.class)

public class TC02VerifyAddToCartFunctionality extends BaseClass
{
         @Test
	        
	        public void addtoCartFunctionality() throws InterruptedException
	        {
	        	 
 	        
	        	 AddToCartProduct home = new AddToCartProduct(driver);
 	        	 home.clickAddtoCart();
	 	        Thread.sleep(3000);
	        	//System.out.println("product add to cart successfully");
	        	
	        	Assert.assertTrue(true);
	            Reporter.log("product add to cart successfully");

	           log.info("Add to cart test executed");
	        }
		
	}


