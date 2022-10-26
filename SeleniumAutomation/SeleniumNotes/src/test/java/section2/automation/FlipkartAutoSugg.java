package section2.automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartAutoSugg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("redmi");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//ul/li"));
		
		for(WebElement wb : allLinks)
		{
			String text = wb.getText();
			if(text.contains("redmi 10prime"))
			wb.click();
			break;
			
		}
		System.out.println("Total Suggestions are: " + allLinks.size());
		
		driver.quit();

	}

}
////form[contains(@class,'cLY')]/ul/li
//div[contains(@class,'oE')]/following-sibling::ul/li