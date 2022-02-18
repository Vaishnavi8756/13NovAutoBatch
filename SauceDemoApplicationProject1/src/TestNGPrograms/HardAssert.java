package TestNGPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{
   @Test 
   
   public void methodLogin()
   {
	   String actualTitle="Swag Labs";
	   
	   String expectedTitle="Labs";
	   Assert.assertEquals(actualTitle,expectedTitle,"title not matched");
	   
	   
     String actualURL="URL1";
	   
	   String expectedURL="URL1";
	 
	Assert.assertEquals(actualURL,expectedURL,"URL not matched");
   }



   @Test
   public void methodLogOut()
  {
   Assert.assertTrue(true);	
   }
}