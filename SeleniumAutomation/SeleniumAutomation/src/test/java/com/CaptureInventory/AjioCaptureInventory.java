package com.CaptureInventory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioCaptureInventory {
	
	public static void main(String[] args) {
		
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ajio.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebElement search = driver.findElement(By.name("searchVal"));
	search.sendKeys("watches");
	search.submit();
	//div.filter-container >div > div.length
	String captureInventory = driver.findElement(By.cssSelector("div.filter-container >div > div.length")).getText();
	System.out.println(captureInventory);
	
	if(captureInventory.contains(""))//add msg
	{
		System.out.println("validation pass");
	}else {
		System.out.println("validation fail");
	}
	
	driver.close();
	
	
	
	
	}
	

}
