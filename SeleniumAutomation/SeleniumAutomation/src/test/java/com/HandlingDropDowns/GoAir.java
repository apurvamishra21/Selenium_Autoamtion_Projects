package com.HandlingDropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoAir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flygofirst.com/travel-information/air-suvidha/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Select s = new Select(driver.findElement(By.id("websites")));
		s.selectByIndex(2);
		s.selectByVisibleText("4 Adults");
		s.selectByValue("2");
		
		driver.close();
		

	}

}
