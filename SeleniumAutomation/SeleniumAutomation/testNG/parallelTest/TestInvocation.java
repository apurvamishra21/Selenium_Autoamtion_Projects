package parallelTest;

import org.testng.annotations.Test;

public class TestInvocation extends BaseTest {
	
	
	
		
		
		@Test(invocationCount=5,threadPoolSize=5)
		public void executeTest() {
			
			driver = getDriver("chrome");
			driver.get("http://google.com");
			
			System.out.println(driver.getTitle());
			
			driver.quit();
		}

	}

//this works with selenium 4.1.1 not with higher versions