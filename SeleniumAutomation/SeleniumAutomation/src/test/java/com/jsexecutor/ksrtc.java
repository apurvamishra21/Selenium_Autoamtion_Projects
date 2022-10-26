package com.jsexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ksrtc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		
		/* WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromPlaceName")));*/
		
		 driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		 
		 JavascriptExecutor js = ( JavascriptExecutor)driver;
		 //write in console
		 //add ‘return’ keyword to store the value in variable
		 String script = "return document.getElementById(\"fromPlaceName\").value;";
		 String text = (String)js.executeScript(script);
		 System.out.println(text);
		 
		 
		 driver.close();//BENGALURU DARSHINI
		 
		 
		 
		 
		
		

	}

}
