package com.BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;





	public class Google {
		
		private static WebDriver driver = null;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			String homepage = "https://www.google.com/";
			String url = "";
			HttpURLConnection huC = null;
			int respCode = 200;
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(homepage);
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			Iterator<WebElement> it = links.iterator();
			
			while(it.hasNext()) {
				url = it.next().getAttribute("href");
				System.out.println(url);
				
				if(url == null || url.isEmpty()) {
					System.out.println("url is not configured");
					continue;
				}
				
				if(!url.startsWith(homepage)) {
					System.out.println("url belongs to another domain");
					continue;
				}
			
			try {
				URL url2 = new URL(url);
				URLConnection oc = url2.openConnection();
				huC = (HttpURLConnection)(oc);
				huC.connect();
				
				respCode = huC.getResponseCode();
				if(respCode >= 400) {
					System.out.println(url + "is a broken link");
				}else {
					System.out.println(url + "is a valid  link");
				}

		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
		driver.quit();
		}
	}

