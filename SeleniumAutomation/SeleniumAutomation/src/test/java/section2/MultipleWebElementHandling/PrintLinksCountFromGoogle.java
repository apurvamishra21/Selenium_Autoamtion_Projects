package section2.MultipleWebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintLinksCountFromGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("way2automation");
		driver.findElement(By.xpath("//div[contains(@class,'FPdoLc')]//input[@name='btnK']")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'Way2Automation: Get Online Selenium Certification ')]")).click();
		//driver.findElement(By.xpath("//a"));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("------------Printing links---------------");
	
		System.out.println("Total links are : "+links.size());
		
		/*for(WebElement link : links) {
			
			System.out.println(link.getText() + "----------------URL IS -----------" + link.getAttribute("href"));
		}*/
		
		
		driver.close();
		
		

	}

}
/*------------Printing links---------------
Total links are : 156
*/