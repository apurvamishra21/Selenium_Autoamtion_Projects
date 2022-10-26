package section2.KeyBoardStrokeHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginBySubmit {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("username")).sendKeys("admin" , Keys.TAB , "manager" , Keys.TAB , Keys.SPACE , Keys.ENTER);
		driver.findElement(By.id("username")).sendKeys("admin");
		Robot r = new Robot();
		
		
		
		

	}

}
