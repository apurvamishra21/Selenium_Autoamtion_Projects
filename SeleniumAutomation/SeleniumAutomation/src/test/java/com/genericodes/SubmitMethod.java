package com.genericodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Way2Automation");
		search.submit();
		
		driver.findElement(By.xpath("//div[@class='tF2Cxc']/div[1]/a/h3")).click();
		
		//driver.findElement(By.xpath("//i[@class='eicon-close']")).click();
		
		WebElement resources = driver.findElement(By.xpath("//div[@id='ast-desktop-header']/div[2]/div[1]//div[2]//nav/div/ul/li[4]/a/span[2]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(resources).perform();
		
		driver.findElement(By.xpath("//div[@id='ast-desktop-header']/div[2]/div[1]//div[2]//nav/div/ul/li[4]/ul/li[1]//span[2]")).click();
		
		
		driver.quit();
		
		
		
		

	}

}
////cite[contains(@class,'tjvcx') and text()='https://www.way2automation.com']/../../..
////div[contains(@class,'ast-builder-grid-row-has-sides')]
////div[@id='ast-desktop-header']/div[2]/div[1]//div[2]//nav/div/ul/li[4]/a/span[2]
//div[@id='ast-desktop-header']/div[2]/div[1]//div[2]//nav/div/ul/li[4]/ul/li[1]//span[2]