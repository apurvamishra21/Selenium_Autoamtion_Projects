package com.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRightClick {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement img = driver.findElement(By.cssSelector("img[src='data-samples/images/popup_pic.gif']"));
		
		Actions act = new Actions(driver);
		act.contextClick(img).perform();
		
		WebElement prodInfo = driver.findElement(By.xpath("//td[text()='Product Info']"));
		act.moveToElement(prodInfo).perform();
		
		driver.findElement(By.xpath("//td[text()='Installation']")).click();
		
		driver.close();
		
	}

}
////td[text()='Product Info']
//td[text()='Installation']