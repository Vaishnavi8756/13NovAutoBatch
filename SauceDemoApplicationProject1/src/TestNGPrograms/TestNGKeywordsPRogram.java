package TestNGPrograms;

import org.testng.annotations.Test;

public class TestNGKeywordsPRogram 
{
	@Test(priority=-1)
	public void methodA()
	{
		System.out.println("methodA");
	}

	
	@Test(invocationCount=2,priority=0)
	public void methodB()
	{
		System.out.println("methodB");
	}
	
	@Test(priority=1)
	public void methodC()
	{
		System.out.println("methodC");
	}
	
	@Test(enabled = false)
	public void methodD()
	{
		System.out.println("methodD");
	}
	
	@Test
	public void methodE()
	{
		System.out.println("methodE");
	}

}
