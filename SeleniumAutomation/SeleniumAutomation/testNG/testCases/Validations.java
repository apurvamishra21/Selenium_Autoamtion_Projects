package testCases;



import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import org.testng.Assert;





public class Validations  {
	
	@Test
	public void check() {

	String actual = "Showing";
	String expected = "showing";
	
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(actual,expected);
	
	System.out.println("Good Afternoon");
	
	
	System.out.println("Validating image");
	sa.assertEquals(true, false);
	//case1
	sa.assertEquals(actual, expected);
	//case2
	//isElementPresent("xpath"); - True , False
sa.assertTrue(false , "Element not found");
	//forcefully fail a test
	System.out.println("Validate text box presence");
	sa.assertEquals(true, false);
	//Assert.fail("Failing the test as the condition is not met");
	
	System.out.println("Ending");
	sa.assertAll();
	
	}
	
	}
		
		
		
	

	
	

	



