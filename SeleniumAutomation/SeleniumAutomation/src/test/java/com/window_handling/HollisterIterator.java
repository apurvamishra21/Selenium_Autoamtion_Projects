package com.window_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HollisterIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hollisterco.com/shop/wd");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement columndriver = driver.findElement(By.xpath("//div[contains(@class,'footer__info-links')]//ul[1]"));
		System.out.println("Total links in first column ---> " + columndriver.findElements(By.tagName("a")).size());
		
		int count = columndriver.findElements(By.tagName("a")).size();
		
		for(int i = 0; i < count ; i++ )
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL , Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
			
			try {
				wait.until(ExpectedConditions.numberOfWindowsToBe(7));
			}catch(TimeoutException e) {
				
			}
		}
		
		java.util.Iterator<String> iter = driver.getWindowHandles().iterator();
		
		while(iter.hasNext())
		{
			driver.switchTo().window(iter.next());
			System.out.println(driver.getTitle());
		}
		
		driver.close();
				
				

	}

}
/*
 * iter.hasNext() tells us whether next index is present or not, line 29
iter.next() actually moves to next window using switchTo() method, line 31
 
Total links in first column ---> 7
Clothing for Women & Men | Teen Clothing | Hollister Co.
Access Denied
Careers/Home Office
A&F Cares/A&F Gives Back/Our Mission
Access Denied
A&F Cares/Diversity
Press Room/Media Gallery/Photos
A&F Cares/Sustainability*/