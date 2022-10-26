package com.WebTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoneyRediff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String companyName = "forbes-and-company-ltd";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		//driver.findElement(By.xpath("//a[@href='//money.rediff.com/gainers/bse/daily/groupa']")).click();
		
		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		 WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
		for(int i = 0; i < companyNames.size() ; i++)
		{
			
			if(companyName.equalsIgnoreCase(companyNames.get(i).getText()))
				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]")));
			System.out.println(companyNames.get(i).getText() + "----------------" + currentPrices.get(i).getText());
		}
		
		driver.close();
		
	}

}
////a[@href='//money.rediff.com/gainers/bse/daily/groupa']
//https://money.rediff.com/companies/forbes-and-company-ltd/16030006