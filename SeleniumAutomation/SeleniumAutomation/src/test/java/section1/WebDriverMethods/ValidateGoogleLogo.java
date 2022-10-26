package section1.WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateGoogleLogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement logo = driver.findElement(By.xpath("//img[contains(@class,'nXdpd')]"));
		if(logo.isDisplayed())
		{
			System.out.println("logo is visible in login page");
		}else {
			System.out.println("logo is not visible in login page");
		}
		
		driver.close();
		

	}

}
//logo is visible in login page


