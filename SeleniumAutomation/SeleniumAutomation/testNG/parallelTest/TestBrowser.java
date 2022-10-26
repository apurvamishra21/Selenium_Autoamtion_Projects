package parallelTest;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowser {


		
		@Parameters({"browser"})
		@Test
		public void doLogin(String b) throws InterruptedException {
			
			Date d = new Date();
			System.out.println("Browser name : "+b+"--"+d);
			Thread.sleep(2000);
		}

	}


/*
 * <test name="Firefox Test">
<parameter name="browser" value="firefox"/>
<classes>
<class name="parallelTest.TestBrowser"/>
</classes>
</test>
<!--  Test  -->
<test name="Chrome Test">
<parameter name="browser" value="chrome"/>
<classes>
<class name="parallelTest.TestBrowser"/>
</classes>
</test>
<!--  Test  -->
</suite>
<!--  Suite  -->
  */
