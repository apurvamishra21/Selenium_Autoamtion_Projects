package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReUsableMethods {
	
	@BeforeTest
	public void createDBConnection() {
		System.out.println("Creating db Conn");
	}
	
	@AfterTest
	public void closeDBConnection() {
		System.out.println("closing db Conn");
	}
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launching Browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		System.out.println("Closing Browser");
		
	}
	
	@Test(priority=2,groups={"functional" , "smoke"})
	public void doLogin() {
	
		System.out.println("Executing login test");
		
	}

	@Test(priority=1,groups="functional")
	public void doUserReg() {
		
	
		System.out.println("Executing User Reg test");
		
	}

}

