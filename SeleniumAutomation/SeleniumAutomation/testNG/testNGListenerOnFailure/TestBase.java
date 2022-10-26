package testNGListenerOnFailure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		
		WebDriverManager.chromedriver().setup();
		if(driver==null){
		driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
	
		
		
		}
	}

	
	@AfterSuite
	public void tearDown(){
		
		driver.quit();
		
	}


	}




