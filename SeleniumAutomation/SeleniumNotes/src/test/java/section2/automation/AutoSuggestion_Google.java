package section2.automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion_Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("selenium");
		
		List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		
		int totalSugg = allSugg.size();
		
		System.out.println("Total suggestions : " + totalSugg );
		
		for(WebElement wb : allSugg)
		{
			System.out.println(wb.getText());
		
		}
		
		driver.close();
		

	}

}
//div.YacQv.gsfi
//input.gLFyf.gsfi
//input[name='q']