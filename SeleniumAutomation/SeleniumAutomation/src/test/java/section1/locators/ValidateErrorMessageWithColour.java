package section1.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateErrorMessageWithColour {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("errormsg")));
		WebElement error = driver.findElement(By.className("errormsg"));
		//WebElement errormsg = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
		String actualError =error.getText();
		
		
		System.out.println(actualError);
		if(actualError.contains("Username or Password is invalid. Please try again."))
		{
			System.out.println("Error text validation pass");
		}else {
			System.out.println("Error text validation fail");
		}
		String colourCode = error.getCssValue("color");//its color not colour
		System.out.println(colourCode);
		
		if(colourCode.equals("rgba(206,1,0,1)")) {
			System.out.println("Error code validation is pass");
		}else {
			System.out.println("Error code validation is fail");
		}
		
		String fontvalue = error.getCssValue("font");
			System.out.println(fontvalue);
		
		driver.close();
	}

	}
/*
 * Username or Password is invalid. Please try again.
Error text validation pass
rgba(206, 1, 0, 1)*/
 /*
  * Username or Password is invalid. Please try again.
Error text validation pass
rgba(206, 1, 0, 1)
Error code validation is fail
13px / 16px Arial, Verdana, Helvetica, sans-serif*/
  

