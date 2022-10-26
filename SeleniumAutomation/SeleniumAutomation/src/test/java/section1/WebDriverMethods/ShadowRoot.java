package section1.WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("chrome://downloads/");
		
		
		
		WebElement ele = driver.findElement(By.xpath("//downloads-manager"));
		
		SearchContext root1 = ele.getShadowRoot();
		SearchContext root2 = (root1.findElement(By.cssSelector("downloads-toolbar"))).getShadowRoot();
		SearchContext root3 = (root2.findElement(By.cssSelector("cr-toolbar#toolbar"))).getShadowRoot();
		SearchContext root4 = (root3.findElement(By.cssSelector("div[id='centeredContent']>cr-toolbar-search-field#search"))).getShadowRoot();
		root4.findElement(By.cssSelector("div#searchTerm>input#searchInput")).sendKeys("abc");

	}

}
