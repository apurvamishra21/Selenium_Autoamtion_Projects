package parameterization;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class TestParametersFromXML {

	

		@Parameters({"browser"})
		@Test
		public void getBrowser(String browser) {
			
			System.out.println(browser);
			
		}
		
	}