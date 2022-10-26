package section1.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\Technical\\HTML\\RegistrationPage.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input")));
		driver.findElement(By.tagName("input")).sendKeys("Swadheenta");
		
		/*FluentWait wait1 = new FluentWait(driver);
		wait1.pollingEvery(Duration.ofSeconds(5));
		wait1.withTimeout(Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input")));*/
		
		System.out.println("Pass");
		
		driver.close();

	}

}
