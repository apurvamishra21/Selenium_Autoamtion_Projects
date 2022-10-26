package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDepensOn {

	@Test(priority = 2 , dependsOnMethods = "doUserReg" )
	public void doLogin() {
		
		System.out.println("Executing login Test");
	}

	@Test(priority = 1)
	public void doUserReg() {
		
		System.out.println("Executing User Reg Test");
		Assert.fail("Failing the test as the condition is not met");
	}
	
	@Test(priority = 4 , dependsOnMethods = "doUserReg" , alwaysRun =true)
	public void thirdTest() {
		System.out.println("Executing Third Test");
	}
	
	@Test(priority = 4 , dependsOnMethods = "doUserReg")
	public void fourthTest() {
		System.out.println("Executing fourth Test");
	}


}
