package com.SauceDemoUtilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{

	public void onTestStart(ITestResult result)
	{
		System.out.println("My test is Started");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Take ScreenShot on Failure");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case is successfully passed");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("To Skip all Methods");
	}
	
	
}
