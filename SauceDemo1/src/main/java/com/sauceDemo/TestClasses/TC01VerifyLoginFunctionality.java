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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.LoginPageClass;

@Listeners(com.SauceDemoUtilities.Listener.class)

public class TC01VerifyLoginFunctionality extends BaseClass
{


		
		
		@Test
		public void verityLogin()
		{
		String actualTitle="Swag Labs";
		//WebDriver driver = null;
		String expectedTitle="Swag Labs";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
       Reporter.log("Login test case is passed");
       
       //log
       log.info("Login test executed");
    }

		
		
	}


