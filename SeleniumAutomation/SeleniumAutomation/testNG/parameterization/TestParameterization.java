package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	@Test(dataProvider = "getData")
	public void doLogin(String username , String password) {
		
		System.out.println(username + "----------" + password);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		data[0][0] = "trainer@way2automation.com";
		data[0][1] = "java";
		
		data[0][0] = "seleniumcoaching@gmail.com";
		data[0][1] = "java";
		
		data[0][0] = "java@way2automation.com";
		data[0][1] = "java";
		
		return data;
		
	}

}
//no of rows = no of parameters