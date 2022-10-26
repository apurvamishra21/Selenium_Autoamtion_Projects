package section1.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayWatchPrice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String watchPrice = "Fashion Womens Ladies Watches Stainless Steel Leather Analog Quartz Wrist Watch";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();



		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		
		WebElement search = driver.findElement(By.id("gh-ac"));
		search.sendKeys("watch");
		search.submit();
		
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(text(),'Women')]/../../..")));
		
		driver.findElement(By.xpath("//div[contains(text(),'Women')]/../../..")).click();
		
		String price = driver.findElement(By.xpath("//span[text()='"+watchPrice+"']/../../following-sibling::div[2]/div[1]")).getText();
		
		System.out.println("Price : "+price);
		
		driver.quit();

	}

}
////span[text()="Fashion Womens Ladies Watches Stainless Steel Leather Analog Quartz Wrist Watch"]/../../following-sibling::div[2]/div[1]
//"//span[text()="Automatic Mechanical Luminous Canvas Rubber Band Men's Watch"]/../../following-sibling::div[2]/div[1]/span"
////span[text()="New Pobeda Masonic Watch Wrist Men's Mechanical Russian Soviet USSR Style Rare"]/../../../following-sibling::div[3]/div[1]/span
// //div[contains(text(),'Women')]//span[@class='clipped']
////div[contains(text(),'Women')]//span[@class='clipped' and contains(text(),'- apply Department filter')]
/*String price = driver.findElement(By.xpath("//span[text()=\"New Pobeda Masonic Watch Wrist Men's Mechanical Russian Soviet USSR Style Rare\"]"
+ "/../../../following-sibling::div[3]/div[1]/span")).getText();*/