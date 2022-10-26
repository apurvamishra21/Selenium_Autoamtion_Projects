package section1.WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpicejetIsEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement returnDate = driver.findElement(By.xpath("//div[text()='Select Date']"));
		
		if(returnDate.isEnabled()) {
			//returnDate.click();
			System.out.println("element is enabled");
		}else {
			System.out.println("element is disabled");
		}
		
		driver.close();

	}

}
//div.r-homxoj.r-ubezar
////div[text()='Select Date']