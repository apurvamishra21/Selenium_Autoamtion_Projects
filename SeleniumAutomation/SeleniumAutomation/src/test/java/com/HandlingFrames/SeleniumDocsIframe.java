package com.HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDocsIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement iframeElement = driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(iframeElement);
		
		driver.findElement(By.xpath("//h2[text()='Packages']/../ul/li[1]")).click();
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//h1[@class='bar']/..//ul/li[1]")).click();
		System.out.println("pass");
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//th[text()='Package']/../../following-sibling::tbody/tr[1]//a")).click();
		System.out.println("pass");
		String text = driver.findElement(By.cssSelector("h1[title='Package']")).getText();
		
		System.out.println(text);
		
		driver.quit();

	}

}
////h2[text()='Packages']/../ul/li[1]
////h1[@class='bar']/..//ul/li[1]
////th[text()='Package']/../../following-sibling::tbody/tr[1]//a
//h1[title='Package']