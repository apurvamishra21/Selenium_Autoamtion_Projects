package seleniumCodingChallenge;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorldPopulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//div.maincounter-number > span
		////div[contains(text(),'Births today ')]/..//div[2]/span
		//String currentPopulation = driver.findElement(By.cssSelector("div.maincounter-number > span")).getText();
		String currentPopulation = driver.findElement(By.cssSelector("div.maincounter-number > span")).getText();
		
		System.out.println(currentPopulation);
		
		String birthToday = driver.findElement(By.xpath("//div[contains(text(),'Births today ')]/..//div[2]/span")).getText();
		
		System.out.println(birthToday);
		
String deathToday = driver.findElement(By.xpath("//div[contains(text(),'Deaths today ')]/..//div[2]/span")).getText();
		
		System.out.println(deathToday);
		
String populationGrowthtoday = driver.findElement(By.xpath("//div[contains(text(),'Population Growth today ')]/..//div[2]/span")).getText();
		
		System.out.println(populationGrowthtoday);
		
String birthsthisyear = driver.findElement(By.xpath("//div[contains(text(),'Births this year ')]/..//div[2]/span")).getText();
		
		System.out.println(birthsthisyear);	
		
String deathsthisyear = driver.findElement(By.xpath("//div[contains(text(),'Deaths this year ')]/..//div[2]/span")).getText();
		
		System.out.println(deathsthisyear);	
		
String populationGrowththisyear = driver.findElement(By.xpath("//div[contains(text(),'Population Growth this year ')]/..//div[2]/span")).getText();
		
		System.out.println(populationGrowththisyear);
		
		while(true) {
		List<WebElement> popList =
				driver.findElements(By.xpath("//div[@class='maincounter-number']/span/span"));
		
		for(WebElement e : popList) {
			System.out.println(e.getText());
		}
		
		}
		
		
		

	}
}

//
//div#maincounter-wrap > div
//here 11 times we are sending response to the server to create a instance for diver not a good approach