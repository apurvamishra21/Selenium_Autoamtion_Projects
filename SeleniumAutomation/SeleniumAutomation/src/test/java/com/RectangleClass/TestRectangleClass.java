package com.RectangleClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRectangleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://gmail.com");
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement img =  driver.findElement(By.id("logo"));
		Rectangle rect = img.getRect();
		
		System.out.println("Height : " +rect.getHeight());
		System.out.println("Width :" + rect.getWidth());
		System.out.println("X coordinate :" +rect.getX());
		System.out.println("Y coord : " +rect.getY());
		
		driver.close();
	}

}
