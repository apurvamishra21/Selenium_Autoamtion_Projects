package com.HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/h1")).click();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		System.out.println("pass");
		
		driver.close();

	}

}
///html/body/h1
/*
15
1
pass*/