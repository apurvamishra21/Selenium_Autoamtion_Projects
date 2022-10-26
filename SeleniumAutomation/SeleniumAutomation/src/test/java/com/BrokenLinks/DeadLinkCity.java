package com.BrokenLinks;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeadLinkCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		int resCode = 200;
		int brokenListCnt = 0;
		System.out.println("Total links on the page : " + linklist.size());
		
		for(WebElement element : linklist)
		{
			String url = element.getAttribute("href");
			try {
				URL urlLink = new URL(url);
				HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				resCode = huc.getResponseCode();
				if(resCode >= 400)
				{
					System.out.println(url + "broken link");
					brokenListCnt++;
				}
			}
			catch(MalformedURLException e)
			{
				
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("Total broken links : " + brokenListCnt);

	}

}
