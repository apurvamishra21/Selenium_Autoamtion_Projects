package section2.MultipleWebElementHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Suppose you have opened 100 windows by clicking on the links on parent window..how to hover to any window we want and how to validate we are on the right page...please note 100 windows */
//How to do using index method

public class SwitchToSpecificWindow {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		  driver =  new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		 String parentWindowId = driver.getWindowHandle();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']//*[name()='svg']")).click();
		
		 driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']")).click();
		 driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']//*[name()='svg']")).click();
		 
		 
		 Set<String> handles = driver.getWindowHandles();
		 List<String> hList = new ArrayList<String>(handles);
		 if(switchToRightWindow("Facebook" , hList)) {
			 System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
			 
		 }
		 
		 switchToParentWindow(parentWindowId);
		 System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());

	}
	public static void switchToParentWindow(String parentWindowId) {
		
		driver.switchTo().window(parentWindowId);
		
	}
	public static void closeAllWindows(List<String> hList , String parentWindowId) {
		
		for(String e : hList) {
			
			if(!e.equals(parentWindowId)) {
				driver.switchTo().window(e).close();
			}
			
		}
		
	}
	
	public static boolean switchToRightWindow(String windowTitle , List<String> hList) {
		
		for(String e : hList) {
			
			String title = driver.switchTo().window(e).getTitle();
			if(title.contains(windowTitle)) {
				System.out.println("found the right window......");
				return true;
			}
			
		}
		return false;
		
		
		
	}
	

}
/*
found the right window......
https://www.facebook.com/OrangeHRM/ : OrangeHRM - World's Most Popular Opensource HRIS - Home | Facebook

found the right window......
https://www.facebook.com/OrangeHRM/ : OrangeHRM - World's Most Popular Opensource HRIS - Home | Facebook
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login : OrangeHRM*/
