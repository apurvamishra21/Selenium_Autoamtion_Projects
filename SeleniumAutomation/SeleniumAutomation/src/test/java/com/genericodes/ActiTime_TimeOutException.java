package com.genericodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTime_TimeOutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("admin" , Keys.TAB , "manager" , Keys.TAB , Keys.SPACE , Keys.ENTER);
		//Keys.enter will directly not work on checkbox so keys.space then keys.enter
		try {
			wait.until(ExpectedConditions.textToBe(By.xpath("//div[text()='Add User']"), "Add Userr"));
		}catch(TimeoutException e) {
			
		}

	}

}
//WebDriverManager is a class
/*
WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
wait.until(ExpectedConditions.textToBe(By.xpath("//div[text()='Add User']"), "Add Userr"));
*/