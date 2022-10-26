package com.BrowserOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowserOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxOptions opt = new FirefoxOptions();
		opt.addArguments("--headless");
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.selenium.dev");
		
		System.out.println(driver.getTitle());
		
		

	}

}
