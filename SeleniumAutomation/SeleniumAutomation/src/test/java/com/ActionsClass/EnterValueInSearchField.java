package com.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterValueInSearchField {
	
	public static void main(String[] args) {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://americangolf.co.uk");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.id("q"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	
	System.out.println("pass");
	
	driver.close();
	
	
	}
}
