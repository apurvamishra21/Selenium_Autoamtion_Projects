package com.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTakeScreenshot {
	
	public static WebDriver driver;
	
public static void captureScreenshot() throws IOException {
		
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//screenshot//"+fileName));
	
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("iframeResult");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("myFunction()");
		
		js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.id("mySubmit")));
		
	
		
		
		//driver.switchTo().window(first_window);
		driver.switchTo().defaultContent();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));

		System.out.println(frames.size());

		for (WebElement frame : frames) {

			System.out.println(frame.getAttribute("id"));
		}
		
		
		captureScreenshot();
		
		

	}

}
