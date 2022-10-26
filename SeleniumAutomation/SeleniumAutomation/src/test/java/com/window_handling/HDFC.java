package com.window_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HDFC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfc.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Blogs")).click();
		
		String clickOnlinkTab = Keys.chord(Keys.CONTROL , Keys.ENTER);
		driver.findElement(By.linkText("Careers")).sendKeys(clickOnlinkTab);
		
		java.util.Iterator<String> iter = driver.getWindowHandles().iterator();
		
		String parentid = iter.next(); //first iter.next() points to current parent window
		String childid = iter.next(); //second iter.next() points to child window
		
		driver.switchTo().window(childid);//switches to child window
		System.out.println(driver.getTitle()); //prints title of the child window
		
		driver.switchTo().window(parentid); //switches back to parent window
		System.out.println(driver.getTitle());//prints title of parent window
		
		driver.close();
		
	}

}
/*
HDFC Careers | HDFC Ltd
Housing Finance | Housing Finance Company in India | HDFC Home Loan*/