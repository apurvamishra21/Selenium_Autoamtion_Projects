package com.window_handling;

import java.time.Duration;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWindow1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		opt.addArguments("disable-infobars");//to disable info bars
		opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String parent = driver.getWindowHandle();
		
		System.out.println("Parent window is : " +parent);
		
		driver.findElement(By.xpath("//div[@dir='ltr']/following-sibling::a[1]")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		int count = allWindows.size();
		
		System.out.println("Total window " +count);
		
		for(String child :allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("button[aria-label='No thanks']")).click();
				WebElement search = driver.findElement(By.cssSelector("input[name='q']"));
						search.sendKeys("Selenium WebDriver");
				/*WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("q")));*/
						Thread.sleep(3000);
				driver.close();
				
			}
		}
		
		driver.switchTo().window(parent);
		System.out.println("Parent window title is " + driver.getTitle());
		
		

	}

}
