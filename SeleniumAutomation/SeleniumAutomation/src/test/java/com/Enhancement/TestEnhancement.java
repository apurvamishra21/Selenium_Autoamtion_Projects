package com.Enhancement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestEnhancement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		WebElement link = driver.findElement(By.linkText("Gmail"));
		
		int x = link.getRect().getX();
		int y = link.getRect().getY();
		
		Actions act = new Actions(driver);
		act.moveByOffset(x, y).click().perform();
		
		

	}

}
/*
 * 1.many methods linktext whish were there in remotedriver are deprecated in selenium 4 now they are in by class
 * 2.actions api is very stable
 * 3.earlier some of it was working on chrome not on firefox in 3*/
