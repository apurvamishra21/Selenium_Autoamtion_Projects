package com.retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
	
	@Test(priority = 1,retryAnalyzer = TestRetry1.class  )
	public void doLogin() {
		
		System.out.println("Executing login Test");
	}
	static int count = 0;
	@Test(priority = 2)
	public void registerUsers() {
		
		count++;
		System.out.println(count);
		//Assert.fail("Failing the test as the condition is not met");
		Assert.assertEquals(count , 3);
	}

}
