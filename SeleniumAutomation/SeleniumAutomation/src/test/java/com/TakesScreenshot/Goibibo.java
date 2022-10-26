package com.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Goibibo{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy src file to destination
		//FileUtils.copyFile(srcFile, destFile);
		
		FileUtils.copyFile(src, new File("D:\\Technical\\software docs\\MyFolderByJava\\screenshot.png.bmp"));
		
		driver.close();

	}

}
