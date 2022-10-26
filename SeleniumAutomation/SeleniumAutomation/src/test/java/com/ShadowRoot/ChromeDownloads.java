package com.ShadowRoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDownloads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("chrome://downloads/");

		WebElement root = driver.findElement(By.cssSelector("downloads-manager"));

		SearchContext shadowRoot1 = (SearchContext)((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root);

		WebElement root2 = shadowRoot1.findElement(By.cssSelector("downloads-toolbar"));
		SearchContext shadowRoot2 = (SearchContext)((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root2);

		WebElement root3 = shadowRoot2.findElement(By.cssSelector("cr-toolbar"));
		SearchContext shadowRoot3 = (SearchContext)((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root3);


		WebElement root4 = shadowRoot3.findElement(By.cssSelector("cr-toolbar-search-field"));
		SearchContext shadowRoot4 = (SearchContext)((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root4);

		shadowRoot4.findElement(By.cssSelector("#searchInput")).sendKeys("Hello");

	}

}
/*
 * shadow root must be open
 
I am using selenium 4, so instead of WebElement , it accept SearchContext.

WebElement shadowDomOne = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);
So I had to use

   searchContext shadowDomOne = (SearchContext) js.executeScript("return arguments[0].shadowRoot", shadowHost);*/