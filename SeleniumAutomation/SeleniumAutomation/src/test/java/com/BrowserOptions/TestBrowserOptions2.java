package com.BrowserOptions;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowserOptions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bYpASS THIS CONNECTION IS NOT PRIVATE
		
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		opt.addArguments("disable-infobars");//to disable info bars
		opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		
		//System.out.println(driver.getTitle());

	}

}
