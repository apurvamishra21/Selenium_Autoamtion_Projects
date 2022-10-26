package com.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlaskaTrips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();



		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels");
		
		
		driver.findElement(By.xpath("//span[text()='Flight + Car']")).click();
		
//origin
		driver.findElement(By.id("package-origin-hp-package")).sendKeys("nyc");
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.TAB);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.TAB);
		
//destination		
		driver.findElement(By.xpath("//input[@id='package-destination-hp-package']")).sendKeys("on");
		driver.findElement(By.xpath("//input[@id='package-destination-hp-package']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='package-destination-hp-package']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='package-departing-hp-package']")).sendKeys("15/10/2022");
		driver.findElement(By.xpath("//input[@id='package-departing-hp-package']")).sendKeys(Keys.ENTER);
		
		
		
		driver.findElement(By.id("package-origin-hp-package")).sendKeys("nyc");
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);
		
		
		
		

	}

}
//#package-origin-hp-package