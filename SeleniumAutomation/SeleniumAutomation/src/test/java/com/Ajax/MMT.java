package com.Ajax;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MMT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.cssSelector("label[for='fromCity'] > span")).click();
		
		 WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.react-autosuggest__input")));
		 
		 driver.findElement(By.cssSelector("input.react-autosuggest__input")).sendKeys("MUM");
		 driver.findElement(By.cssSelector("input.react-autosuggest__input")).sendKeys(Keys.DOWN);
		 driver.findElement(By.cssSelector("input.react-autosuggest__input")).sendKeys(Keys.ENTER);
		 
		 System.out.println("pass");
		 
		 driver.close();
		

	}

}
////input[contains(@class,'react-autosuggest__input')]
//input.react-autosuggest__input
////span[contains(@class,'lbl_input')]
//label[for='fromCity'] > span