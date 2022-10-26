package section1.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

public static String browser = "chrome";
public static ChromeDriver driver;


	
	
		public static void main(String[] args) {
			
			if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver =  new ChromeDriver();
		 
		}else if(browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			 //driver =  new FirefoxDriver();
			
		}
			
		driver.get("http://way2automation.com");
		
		String title = driver.getTitle();
		System.out.println(title.length());
		System.out.println(title);

	}

}
/*
57
Get Online Selenium Certification Course | Way2Automation*/