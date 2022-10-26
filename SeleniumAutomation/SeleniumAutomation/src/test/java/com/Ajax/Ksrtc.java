package com.Ajax;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ksrtc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ksrtc.in/oprs-web/");
		
		 WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromPlaceName")));
		 
		 driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		 driver.findElement(By.id("fromPlaceName")).getAttribute("value");
		 
		 System.out.println("pass");
		
		driver.close();

	}

}
