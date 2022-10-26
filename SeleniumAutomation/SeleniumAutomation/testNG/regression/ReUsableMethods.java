package regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testCases.BaseTest;

public class ReUsableMethods extends BaseTest{
	
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
	
	@Test(priority = 2 , groups={"smoke"})
	public void doLogin() {
		
		System.out.println("Executing login Test");
	}

	@Test(priority = 1 ,groups={"smoke" , "functional"})
	public void doUserReg() {
		
		System.out.println("Executing User Reg Test");
	}

}

