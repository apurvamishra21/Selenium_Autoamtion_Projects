package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void validateTitles() {
		
		System.out.println("Validating title");
		String expected_title = "Yahoo.com";
		String actual_title = "Gmail.com";
		
		/*if(expected_title.equals(actual_title)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
	*/
		System.out.println("Validating image");
		Assert.assertEquals(true, false);
		//case1
		Assert.assertEquals(actual_title, expected_title);
		//case2
		//isElementPresent("xpath"); - True , False
		Assert.assertTrue(false , "Element not found");
		//forcefully fail a test
		System.out.println("Validate text box presence");
		Assert.assertEquals(true, false);
		//Assert.fail("Failing the test as the condition is not met");
		System.out.println("Ending");
		
		
		
	}
}
