package section1.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.cssSelector("input[placeholder = 'Username']"));
		if(username.isDisplayed()) {
			System.out.println("visible in UI");
		}else {
			System.out.println("not visible in UI");
		}
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		if(loginBtn.isEnabled()) {
			System.out.println("Its Enabled");
		}else {
			System.out.println("Its not Enabled");
		}
		loginBtn.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("errormsg")));
		
		WebElement errormsg = driver.findElement(By.className("errormsg"));
		
		
		System.out.println(errormsg.getTagName());
		
		driver.close();

	}

}
