package section1.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureIstAndLastAddToCompare {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptureIstAndLastAddToCompare ca = new CaptureIstAndLastAddToCompare();
		ca.launchChrome();
		ca.loginFlipkart();
		ca.captureAddToCompare();
		ca.closeBrowser();

	}
	
	public void launchChrome()
	{
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	
	
	}
	public void loginFlipkart()
	{
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphoneX");
		search.submit();
	}
	
	public void captureAddToCompare()
	{
		driver.findElement(By.xpath("(//span[text()='Add to Compare'])/../..//div[1]")).click();
		System.out.println("pass");
		driver.findElement(By.xpath("(//span[text()='Add to Compare']/../..//div[1])[last()]")).click();
		System.out.println("pass");
	}
	
	public void closeBrowser()
	{
		driver.close();
	}

}
