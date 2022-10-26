package com.HandlingDropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetDynamicDD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step b:Click 'Departure city' dropdown
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		//step c:Select 'Bengaluru(BLR) from departure city
		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'BLR')]")));
		driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).click();
		//step d:Select 'Chennai (MAA) from arrival city
		//driver.findElement(By.xpath("//a[contains(text(),'Chennai (MAA)')]")).click();
		//driver.findElement(By.xpath("//div[@id='glsct100_mainContent_ddl_destinationStation1_CTNR'] //a[contains(text(),'Chennai (MAA)']")).click();
		//driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'MAA')]")));
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).click();
		//div[@data-testid='to-testID-destination']
		System.out.println("pass");
		driver.close();
		

	}

}
