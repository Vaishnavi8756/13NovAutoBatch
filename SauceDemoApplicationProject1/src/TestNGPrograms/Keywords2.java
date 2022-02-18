package TestNGPrograms;

import org.testng.annotations.Test;

public class Keywords2 
{
	@Test
	public void methodA()
	{
		System.out.println("methodA");
	}

	
	@Test(dependsOnMethods={"methodA"})
	public void methodB()
	{
		System.out.println("methodB");
	}
	
	@Test(priority=0)
	public void methodC()
	{
		System.out.println("methodC");
	}
	
	@Test(timeOut=3000)
	public void methodD() throws InterruptedException
	{
		System.out.println("methodD");
		Thread.sleep(5000);
	}
	
	@Test
	public void methodE()
	{
		System.out.println("methodE");
	}
}
