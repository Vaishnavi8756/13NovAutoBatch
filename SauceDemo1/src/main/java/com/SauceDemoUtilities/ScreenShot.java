package com.SauceDemoUtilities;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot 
{
	static void screenshotMethod(WebDriver driver) throws IOException
	{
		
		Date date=new Date(0);
		DateFormat d= new SimpleDateFormat("MM-dd-yy  & HH-mm-ss" );
		String newDate= d.format(date);
	
       TakesScreenshot ts = (TakesScreenshot)driver;
    	
    	File source = ts.getScreenshotAs(OutputType.FILE);
    	
    	File dest = new File("C:\\Users\\user\\Downloads\\Screenshot\\" + newDate +".jpg");
    	
    	FileHandler.copy(source, dest);
    	
    	System.out.println(" Screenshot Has Been Taken");
    	
	
}
}
