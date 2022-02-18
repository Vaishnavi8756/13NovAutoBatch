package SamplePackage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.SauceDemoUtilities.Listener.class)
public class SampleClass1
{
	@Test
	public void method1()
	{
		System.out.println("method 1");
		Reporter.log("TestPassed", true);
		Assert.assertTrue(true);
	}
	
	@Test
	public void method2()
	{
		System.out.println("method 2");
		Reporter.log("TestFailed", true);
		Assert.fail();
	}
	
	@Test
	public void method3()
	{
		System.out.println("method 3");
		Reporter.log("TestPassed", true);
	}
	
	@Test
	public void method4()
	{
		System.out.println("method 4");
		Reporter.log("TestPassed", true);
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="method2")
	public void method5()
	{
		System.out.println("method 5");
		Reporter.log("TestSkipped", true);
	}

}
