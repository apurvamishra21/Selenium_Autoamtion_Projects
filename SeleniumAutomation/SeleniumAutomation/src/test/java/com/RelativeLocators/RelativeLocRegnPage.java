package com.RelativeLocators;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocRegnPage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\Technical\\HTML\\RegistrationPage.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement phoneNum = driver.findElement(By.cssSelector("input[type='phonenumber']"));
		WebElement emailId = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement loginlink = driver.findElement(By.linkText("LoginPage"));
		WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));
		
		WebElement above = driver.findElement(RelativeLocator.with(By.tagName("input")).above(phoneNum));
				above.sendKeys("apurvamishra21@gmail.com");
			File aboveScrn = above.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(aboveScrn, new File("./screenshot/above.jpg"));
			
		 driver.findElement(RelativeLocator.with(By.tagName("input")).below(emailId)).sendKeys("9437248583");
		 driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(loginlink)).click();
		 driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(checkBox)).click();
		 
		// driver.findElement(RelativeLocator.with(By.tagName("input")).below(phoneNum).toRightOf(loginlink)).click();
		 
		 System.out.println("pass");
		 
		 driver.close();
		 
		 
	

	}

}
////a[text()='LoginPage']
//input[type='checkbox']