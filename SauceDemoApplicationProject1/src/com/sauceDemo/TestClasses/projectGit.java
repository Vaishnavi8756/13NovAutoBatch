package com.sauceDemo.TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class projectGit 
{
	WebDriver driver = null;
	@Test
	public void verityLogin()
	{
	String actualTitle="Swag Labs";
	Object driver = null;
	//WebDriver driver = null;
	String expectedTitle=((WebDriver) driver).getTitle();
	
	
	if(expectedTitle.equals(actualTitle))
	{
		System.out.println("login test is passed");
	}
	else
	{
		System.out.println("login test is failed");
	}
}
}
