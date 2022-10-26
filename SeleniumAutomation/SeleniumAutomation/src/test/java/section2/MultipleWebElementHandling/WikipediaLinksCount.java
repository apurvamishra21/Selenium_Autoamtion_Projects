package section2.MultipleWebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WikipediaLinksCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		//can do this on makemytrip.com
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("------------Printing links---------------");
		//0 - size-1(61-1=60)
		System.out.println("Total links are : "+links.size());
		
		for(WebElement link : links) {
			
			System.out.println(link.getText() + "----------------URL IS -----------" + link.getAttribute("href"));
		}
		
		
		driver.close();
		
	}

}
