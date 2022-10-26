package com.HandlingCalendars;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoIbibo {
	static WebDriver driver;
	public static void main(String[] args) throws ParseException, InterruptedException {

		//udemy
		// TODO Auto-generated method stub
		/*String d = "30/10/2022";
		String months[] = {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" ,"October" , "November" , "December"};
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();



		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" https://www.goibibo.com/");

		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(3000);
		//extract day , month , year
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date myDate = sdf.parse(d);//import from java.util
		Calendar cal = Calendar.getInstance();
		cal.setTime(myDate);

		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);

		System.out.println(day);
		System.out.println(months[month]);
		System.out.println(year);


		String forwardArrow = "//span[@class='DayPicker-NavButton DayPicker-NavButton--next']";
		String travelMonth = months[month] + " " + year;
		System.out.println(travelMonth);

		String xpathMonthYearSection = "//div[@class='sc-lbhJGD bHgpcs']/div/div/div/div/div";

		while(!driver.findElement(By.xpath(xpathMonthYearSection)).getText().equals(travelMonth)) {
			driver.findElement(By.xpath(xpathMonthYearSection)).click();
		}

		driver.findElement(By.xpath("//div[text()='" + day + "']")).click();//select desired data

		System.out.println("pass");
		driver.close();*/

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();



		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");

		driver.findElement(By.xpath("//span[text()='Departure']")).click();



		new WebDriverWait(driver , Duration.ofSeconds(5))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div.sc-jgrJph.gAiyey")));

		selectDate("15" , "October" , "2022");
		//selectDate("31" , "February" , "2023");



	}	

	public static String[] getMonthYear(String monthYearVal) {

		return monthYearVal.split(" ");

	}

	public static void selectDate(String exDay , String exMonth , String exYear) {

		if(exMonth.equals("October") && Integer.parseInt(exDay)>29) {

			System.out.println("wrong date:" + exMonth + " : " + exDay);
			return;
		}

		if(Integer.parseInt(exDay)>31) {

			System.out.println("wrong date:" + exMonth + " : " + exDay);
			return;

		}

		String	monthYearVal = driver.findElement(By.cssSelector("div.DayPicker-Caption > div")).getText();

		System.out.println(monthYearVal);

		//String month = monthYearVal.split(" ")[0].trim();
		//String year = monthYearVal.split(" ")[1].trim();

		while(!(getMonthYear(monthYearVal)[0].equals(exMonth) 
				&& 
				getMonthYear(monthYearVal)[1].equals(exYear))) {
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();

			monthYearVal = driver.findElement(By.cssSelector("div.DayPicker-Caption > div")).getText();
			//System.out.println(monthYearVal);

			/*month = monthYearVal.split(" ")[0].trim();
			year = monthYearVal.split(" ")[1].trim();*/
		}
		//driver.findElement(By.xpath("//a[text()='"+exDay+"']")).click();
		try {
			//driver.findElement(By.xpath("//div[@class='DayPicker-Day']/p[text()='15']")).click();
			driver.findElement(By.xpath("//div[@class='DayPicker-Day']/p[text()='"+exDay+"']")).click();
		}
		catch(Exception e) {
			System.out.println("wrong date:" + exMonth + " : " + exDay);
		}

		System.out.println("pass");
		driver.close();
	}



}


/*
The month is getting printed as numeric (2) as of now. We don’t want numeric month name, we want alphabetical, viz ‘March’ or April etc.

To handle this situation, we will create a month array & enter all the months inside it
When you click the calendar, by default, the current month would be shown. The date that we have set in our program is a future date viz 31st Mar 2021. Now we have to develop a logic that will keep clicking forward arrow > till we get March 2021 calendar

 */