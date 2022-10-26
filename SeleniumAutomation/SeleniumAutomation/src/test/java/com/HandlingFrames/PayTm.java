package com.HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PayTm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign In']")));
		}catch(TimeoutException e) {
			
		}
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		System.out.println("Count of frames: ---> " +driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(0);
		
		String msg = driver.findElement(By.cssSelector(".qr-code-footer.ng-scope > div")).getText();
		
		System.out.println(msg);
		
		driver.close();
		

	}

}
//div[@class='_3ac-']