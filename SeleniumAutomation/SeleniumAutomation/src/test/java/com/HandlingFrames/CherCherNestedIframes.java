package com.HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CherCherNestedIframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.tagName("input")).sendKeys("this is text msg");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		
		WebElement dropdownElement = driver.findElement(By.id("animals"));
		
		Select dropDown = new Select(dropdownElement);
		dropDown.selectByVisibleText("Big Baby Cat");
		
		
		System.out.println("pass");
		driver.quit();
		

	}

}
