package seleniumCodingChallenge;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorldPopulation_Correct {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String xpath_current_pop = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		String xpath_Today_pop = "//div[text()='Today']//parent::div//span[@class='rts-counter']";
		String xpath_ThisYear_pop = "//div[text()='This year']//parent::div//span[@class='rts-counter']";
		String xpath_Today_ThisYear_pop = "//div[text()='This year'or text()='Today']//parent::div//span[@class='rts-counter']";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		////div[@class='maincounter-number']/span/span
		//div.maincounter-number > span> span:first-child
		
		/*while(true) {
		List<WebElement> popList = driver.findElements(By.cssSelector("div.maincounter-number > span> span:first-child"));
		for(WebElement e : popList) {
			System.out.println(e.getText());
		}
		popList = driver.findElements(By.cssSelector("div.maincounter-number > span> span:first-child"));
		//org.openqa.selenium.StaleElementReferenceException
		 * child spans are changing everytime
		 //div.maincounter-number > span - go for this parent xpath that doesnt change frequently
		 
		}*/
		int count = 1;
		while(count <= 20) {
			System.out.println(count +" sec ");
			if(count == 21)
				break;
			System.out.println("-----------current population count------");
		printPopulationData(xpath_current_pop);
		
		/*printPopulationData(xpath_Today_pop);
		printPopulationData(xpath_ThisYear_pop);*/
		System.out.println("-----------Today population count------");
		printPopulationData(xpath_Today_ThisYear_pop);
		System.out.println("--------------------");
		
		Thread.sleep(1000);
		count++;
		}
		
		driver.close();
		
		
	}
		public static void printPopulationData(String locator) { 
		
		//while(true) {
			List<WebElement> popList = driver.findElements(By.xpath(locator));
			for(WebElement e : popList) {
				System.out.println(e.getText());
				}
			//driver.findElements(By.xpath(locator)).stream().forEach(e -> System.out.println(e.getText()));
			
			
			
			}
}

