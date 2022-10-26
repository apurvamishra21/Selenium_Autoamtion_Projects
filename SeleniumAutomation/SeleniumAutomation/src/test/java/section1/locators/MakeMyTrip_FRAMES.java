package section1.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MakeMyTrip_FRAMES {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		
	//driver.switchTo().frame(0);
	driver.switchTo().defaultContent();
	//driver.switchTo().frame(4);
	WebElement frameEle = driver.findElement(By.xpath("//iframe[@id='webklipper-publisher-widget-container-notification-frame'])"));
	
	driver.switchTo().frame(frameEle);

	/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("webklipper-publisher-widget-container-notification-close-div")));
WebDriverWait wait1 = new WebDriverWait(driver , Duration.ofSeconds(5));
try {
	wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("webklipper-publisher-widget-container-notification-close-div")));
}catch(TimeoutException e) {
	
}*/
	System.out.println("pass");
	WebElement closeIcon = driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div"));
		closeIcon.click();
		
	}

}
