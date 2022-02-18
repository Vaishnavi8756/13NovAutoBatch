package TestNGPrograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGProgram1
{
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Complete logout and browser is closed");
	}
	

	@Test
	void verifyLogin()
	{
		System.out.println("Login is verified");
	}
	
	@BeforeMethod
	public void openBrowser()
	{
		System.out.println("Browser is opened and URL is opened");
	}

}
