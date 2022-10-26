package section1.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriJobsTab {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver ;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.cssSelector(".nI-gNb-log-reg")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("usernameField")).sendKeys("apurvamishra21@gmail.com");

		driver.findElement(By.id("passwordField")).sendKeys("91295@Ap");

		WebElement login =driver.findElement(By.cssSelector("button.waves-effect.waves-light.btn-large.btn-block.btn-bold.blue-btn.textTransform"));
		login.click();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		try {
			wait.until(ExpectedConditions.stalenessOf(login));
		}catch(TimeoutException e) {
			
		}

		

		driver.findElement(By.className("nI-gNb-sb__placeholder")).click();

		driver.findElement(By.cssSelector("input[placeholder='Enter keyword / designation / companies']")).sendKeys("JAVA SELENIUM BDD CUCUMBER SDET RESTASSURED");

		//driver.findElement(By.xpath("(//input[contains(@class,'suggestor-input ')])[1]")).sendKeys("JAVA SELENIUM BDD CUCUMBER SDET RESTASSURED");
		driver.findElement(By.name("experienceDD")).click();
		driver.findElement(By.xpath("//span[text()='4 years']")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'suggestor-input ')])[2]")).sendKeys("Bengaluru");
		driver.findElement(By.cssSelector(".ni-gnb-icn.ni-gnb-icn-search")).click();
		
		Actions act = new Actions(driver);
		WebElement jobsTab = driver.findElement(By.xpath("(//div[contains(@class,'nI-gNb-search-bar--displaced')]/../preceding-sibling::div/../div[2]/nav/ul/li/a/div)[1]"));
		act.moveToElement(jobsTab).perform();
		
		driver.findElement(By.cssSelector("li.nI-gNb-menuItems > div > ul > li > a > div:first-child")).click();
		

	}

}
