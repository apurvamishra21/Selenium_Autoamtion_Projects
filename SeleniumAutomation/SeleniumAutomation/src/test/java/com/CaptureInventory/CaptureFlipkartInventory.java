package com.CaptureInventory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureFlipkartInventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphoneX");
		search.submit();
		
		String inventoryMsg = driver.findElement(By.xpath("//span[contains(@class,'Ermr')]")).getText();
		System.out.println(inventoryMsg);
		
		if(inventoryMsg.startsWith("Showing"))
		{
			System.out.println("validation pass");
		}else {
			System.out.println("validation fail");
		}
		
		driver.close();
		
		
	}

}
