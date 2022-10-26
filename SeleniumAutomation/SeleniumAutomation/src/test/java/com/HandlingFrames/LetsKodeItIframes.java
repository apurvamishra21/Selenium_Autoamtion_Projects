package com.HandlingFrames;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetsKodeItIframes {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	String baseUrl = "https://courses.letskodeit.com/practice";
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(baseUrl);
	WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//iframe[@id='courses-iframe']")));
	driver.switchTo().frame("courses-iframe");
	//driver.switchTo().frame("iframe-name");
	//driver.switchTo().frame(0);
	System.out.println("pass");
	
	JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	jse1.executeScript("window.scrollBy(0 , 500);");
	
	driver.findElement(By.cssSelector("input[name='course']")).sendKeys("python");
	System.out.println("pass");
	driver.switchTo().parentFrame();
	
	jse1.executeScript("window.scrollBy(0 , -500);");
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[name='enter-name']")));
	driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys("Test Successful");
	System.out.println("pass");
	
	driver.quit();
	
}
}
//input[name='enter-name']