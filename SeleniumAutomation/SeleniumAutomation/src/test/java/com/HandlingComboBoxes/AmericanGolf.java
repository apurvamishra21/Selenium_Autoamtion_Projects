package com.HandlingComboBoxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmericanGolf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://americangolf.co.uk");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@class='header-navigation-left']/ul/li[3]/a"))).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
		
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Layering' and @xpath='1']/..//ul/li[1]/a/span")));
		}catch(TimeoutException e) {
			
		}
		driver.findElement(By.xpath("//div[text()='Layering' and @xpath='1']/..//ul/li[1]/a/span")).click();
		
		System.out.println("pass");
		
		driver.close();

	}

}
////ul[contains(@class,'menu-category')]
//div[@class='header-navigation-left']/ul/li[3]/a
//div[text()='Layering' and @xpath='1']/..//ul/li[1]/a/span
