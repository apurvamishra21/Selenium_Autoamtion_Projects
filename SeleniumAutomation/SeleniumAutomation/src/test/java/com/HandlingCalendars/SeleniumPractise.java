package com.HandlingCalendars;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractise {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		
		
		new WebDriverWait(driver , Duration.ofSeconds(5))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		
		selectDate("15" , "October" , "2022");
		//selectDate("31" , "February" , "2023");
		
		
		
	}	
	
	public static String[] getMonthYear(String monthYearVal) {
		
		return monthYearVal.split(" ");
		
	}
	
	public static void selectDate(String exDay , String exMonth , String exYear) {
		
		if(exMonth.equals("February") && Integer.parseInt(exDay)>29) {
			
			System.out.println("wrong date:" + exMonth + " : " + exDay);
			return;
		}
		
		if(Integer.parseInt(exDay)>31) {
			
			System.out.println("wrong date:" + exMonth + " : " + exDay);
			return;
			
		}
			
		String	monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
		
		System.out.println(monthYearVal);
		
		//String month = monthYearVal.split(" ")[0].trim();
		//String year = monthYearVal.split(" ")[1].trim();
		
		while(!(getMonthYear(monthYearVal)[0].equals(exMonth) 
				&& 
				getMonthYear(monthYearVal)[1].equals(exYear))) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
			//System.out.println(monthYearVal);
			
			/*month = monthYearVal.split(" ")[0].trim();
			year = monthYearVal.split(" ")[1].trim();*/
		}
			try {
			driver.findElement(By.xpath("//a[text()='"+exDay+"']")).click();
			}
			catch(Exception e) {
				System.out.println("wrong date:" + exMonth + " : " + exDay);
			}
			//driver.close();
		}
	
		
	
	}
	


