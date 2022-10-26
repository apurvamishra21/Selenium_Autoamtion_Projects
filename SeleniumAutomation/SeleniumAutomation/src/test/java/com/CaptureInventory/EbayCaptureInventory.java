package com.CaptureInventory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayCaptureInventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement search = driver.findElement(By.id("gh-ac"));
		search.sendKeys("womenwatches");
		search.submit();
		
		////h1[@class = 'srp-controls__count-heading' and contains(text(),'results for')]
		
//		String inventoryPrice = driver.findElement(By.cssSelector("h1.srp-controls__count-heading > span")).getText();
//		System.out.println(inventoryPrice);
		
		String inventoryPriceMsg = driver.findElement(By.xpath("//h1[@class = 'srp-controls__count-heading' and contains(text(),'results for')]")).getText();
		System.out.println(inventoryPriceMsg);

		if(inventoryPriceMsg.contains("results for"))
		{
			System.out.println("validation pass");
		}else {
			System.out.println("validation fail");
		}
		
		
		driver.close();
		

	}

}
