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
//The task here is to keep performing keyDown operation till BENGALURU INTERNATION AIRPORT gets selected.
public class KSRTC2 {

	public static void main(String[] args) throws InterruptedException {
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
		 
		 //BENGALURU INTERNATION AIRPORT
		 int i = 0;
		 while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		 {
			 i++;
			 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			 //Thread.sleep(1000);
			 text = (String)js.executeScript(script);
			 System.out.println(text);
			 //So if we try to search for an invalid text (line#23 in the below figure), than we will never come out of the ‘while’ loop, it would be an infinite loop. So there should be some mechanism to break the ‘while’ loop if the text is not found. The approach that we will follow here is that: we will perform keydown operation for only 10 times viz we will check just 10 options. If the desired text does not match any of the 10 options, than we will break out from the ‘while’ loop (line#31 in the below figure).
			if(i > 10)
				break;
			
			 
		 }
		 if(i > 10)
		 {
			 System.out.println("Element not found");
		 }else {
			 System.out.println("Element found");
		 }
		 
		 driver.close();
			 

	}

}
/*
CHIKKALSANDRA BENGALURU
BENGALURU INTERNATION AIRPORT
Element found*/