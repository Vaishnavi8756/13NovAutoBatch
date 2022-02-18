package TestNGPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoft
{
	 
	SoftAssert soft= new SoftAssert();
	@Test 
	   
   public void methodLogin()
	   {
		   String actualTitle="Swag Labs";
		   String expectedTitle="Labs";
		   Assert.assertEquals(actualTitle,expectedTitle,"title not matched");
		   
		   
	     String actualURL="UR";
		 String expectedURL="URL1";
		Assert.assertEquals(actualURL,expectedURL,"URL not matched");
		
		soft.assertAll();
	   }





	@Test
	   public void methodLogOut()
	  {
	   Assert.assertTrue(false);	
	   soft.assertAll();
	   }





	
}
