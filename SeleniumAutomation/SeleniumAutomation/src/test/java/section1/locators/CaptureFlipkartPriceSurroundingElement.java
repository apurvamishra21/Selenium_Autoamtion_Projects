package section1.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureFlipkartPriceSurroundingElement {
	WebDriver driver;
	public static void main(String[] args) {
		
		String productName = "OnePlus Nord CE 2 Lite 5G (Blue Tide, 128 GB)";
		
		CaptureFlipkartPriceSurroundingElement cfp = new CaptureFlipkartPriceSurroundingElement();
		cfp.launchChrome();
		String price = cfp.getProductPrice(productName);
		System.out.println(productName + " price is : " + price);
		cfp.closeBrowser();
		
		
	}
		public void launchChrome()
		{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		}
		
		public String getProductPrice(String productName) {
		//✕
			//(//a[text()='OnePlus Nord CE 2 Lite 5G (Blue Tide, 128 GB)']/../a[3]/div/div[1])[1]
			//(//a[text()='"+productName+"']/../a[3]/div/div[1])[1]
			//(//*[text()='Add to Compare'])[last()]
			
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			WebElement search = driver.findElement(By.name("q"));
			search.sendKeys("one plus");
			search.submit();
			
			String price =driver.findElement(By.xpath("(//a[text()='"+productName+"']/../a[3]/div/div[1])[1]")).getText();
			return price;
		}
		public void closeBrowser()
		{
			driver.close();
		}
		
			
			
			
			
			
		}
		

	//nePlus Nord CE 2 Lite 5G (Blue Tide, 128 GB) price is : ₹19,874


