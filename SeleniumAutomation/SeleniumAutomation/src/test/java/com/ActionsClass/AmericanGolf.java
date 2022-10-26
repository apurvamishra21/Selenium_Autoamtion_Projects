package com.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmericanGolf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		//Thread.sleep(5000);
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://americangolf.co.uk");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions a = new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),' Golf Clubs')]"))).click();->ElementNotVisibleException
		a.moveToElement(driver.findElement(By.xpath("//div[@id=\"header-navigation\"]/div[1]/ul/li[2]/a"))).build().perform();
		
		driver.findElement(By.xpath("//div[contains(@id,'CLUBS')]//span[@class='name' and text()='Drivers']")).click();
		//driver.findElement(By.xpath("//div[contains(@id,'CLOTHFOOTW')]//span[@class='name'][contains(text(),'Shirts')]")).click();
		
		System.out.println("pass");
		
		driver.close();
	}

}
//contains(@class,'a-level') 
////div[contains(@id,'CLUBS')]//span[@class='name' and text()='Drivers']
////div[contains(@id,'CLOTHFOOTW')]