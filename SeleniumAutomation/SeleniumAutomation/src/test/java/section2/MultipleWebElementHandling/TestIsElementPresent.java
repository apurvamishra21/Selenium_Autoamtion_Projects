package section2.MultipleWebElementHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIsElementPresent {
	public static WebDriver driver;
	
	public static boolean isElementPresent(By by) {
		
		/*try {
		driver.findElement(By.xpath(locator));
		return true;
		}catch(Throwable t) {
			
			return false;
		}*/
		
		int size = driver.findElements(by).size();
		if(size == 0) {
			return false;
		}else {
			return true;
		}
		
	}
	
public static boolean isElementPresentCss(String locator) {
		
		/*try {
		driver.findElement(By.xpath(locator));
		return true;
		}catch(Throwable t) {
			
			return false;
		}*/
		
		int size = driver.findElements(By.cssSelector(locator)).size();
		if(size == 0) {
			return false;
		}else {
			return true;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//System.out.println(driver.findElement(By.xpath("//a[@id='js-link-box-en']/strong")).isDisplayed());
		System.out.println(isElementPresent(By.id("searchLanguage")));
		//isDisplayed() checks visibility of element not the presence
	}

}
