package com.Ajax;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Yahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://in.yahoo.com/?p=us");
		driver.findElement(By.id("yschsp")).sendKeys("hello");
		
		 WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.sa-tray-list-container")));
		 
		 List<WebElement> values = driver.findElements(By.cssSelector("ul.sa-tray-list-container"));
		 
		 for(int i = 0; i < values.size(); i++)
		 {
			 System.out.println(values.get(i).getText());
		 }
		 
		 driver.close();
	}

}
