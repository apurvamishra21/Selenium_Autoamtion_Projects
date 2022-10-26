package com.HandlingComboBoxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JobServe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String industry = "Education";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jobserve.com/in/en/Job-Search/");
		
		driver.findElement(By.id("ddcl-selInd")).click();
		
		driver.findElement(By.cssSelector("label[for='ddcl-selInd-i0']")).click();
		
		List<WebElement> allIndustries = driver.findElements(By.xpath("//div[@id='industryDisplay']/div/div/div/label"));
		for(int i = 0; i < allIndustries.size(); i++)
		{
			//System.out.println(allIndustries.get(i).getText());
			if(allIndustries.get(i).getText().equalsIgnoreCase(industry))
			{
				allIndustries.get(i).click();
			}
		}
		
		driver.close();
		

	}

}
//https://www.jobserve.com/in/en/Job-Search/
////div[@id='industryDisplay']/div/div/div/label