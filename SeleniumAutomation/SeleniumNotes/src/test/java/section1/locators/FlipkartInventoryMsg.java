package section1.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartInventoryMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String mobName = "Nokia 105 SS";
		String mobName = "Nokia 109 cm (43 inch) Ultra HD (4K) LED Smart Android ...";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Nokia");
		search.submit();
		
		
		
		String inventoryMsg = driver.findElement(By.xpath("//span[contains(@class,'Ermr')]")).getText();
		System.out.println(inventoryMsg);
		
		if(inventoryMsg.startsWith("Showing"))
		{
			System.out.println("validation pass");
		}else {
			System.out.println("validation fail");
		}
		
		String mobPrice = driver.findElement(By.xpath("//a[contains(text(),'"+mobName+"')]/following-sibling::div/..//a[3]/div/div[1]")).getText();
		
		System.out.println(mobPrice);
		driver.close();
	}
		
		

}
////span[starts-with(text(),'Showing')]
////a[contains(text(),'Nokia 105 SS')]/following-sibling::div/..//a[3]/div/div[1]
