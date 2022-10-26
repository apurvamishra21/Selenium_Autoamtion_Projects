package com.HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeCRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://classic.crmpro.com/index.html");
		
		/*
		 * freecrm
		 * WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
	
		driver.findElement(By.linkText("Login")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		driver.findElement(By.name("email")).sendKeys("apurvamishra21@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("Bk@181995");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("i.users.icon"))).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		
		System.out.println("pass");*/
		
		driver.findElement(By.name("username")).sendKeys("apurvamishra21@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Bk@181995");
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value='Login']")));
		}catch(TimeoutException e) {
			
		}
		//By.xpath("//frame[@name='mainpanel']")
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		Thread.sleep(3000);
		
		System.out.println("pass");
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@name='mainpanel']")));
		
		////driver.switchTo().frame("mainpanel");
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Contacts")));
		
		//driver.findElement(By.linkText("Contacts")).click();
		
		
		driver.close();
		

	}

}
//.btn.btn-small
//input[name='username']
//i.users.icon
//input[name='email']
//input[name='password']
//div[text()='Login']
////span[text()='Contacts']