package com.CaptureInventory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement search = driver.findElement(By.name("q"));
				search.sendKeys("Virat Kohli");
				search.submit();
				
		String captureInventoryMsg = driver.findElement(By.id("result-stats")).getText();
		System.out.println(captureInventoryMsg);
		
		
		
		if(captureInventoryMsg.contains("results"))
		{
			System.out.println("validation pass");
		}else {
			System.out.println("validation fail");
		}
		
		driver.close();

	}

}
/*
About 6,99,00,000 results (0.49 seconds) 
validation pass*/