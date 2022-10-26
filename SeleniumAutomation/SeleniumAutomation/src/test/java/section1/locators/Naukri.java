package section1.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		/*driver.findElement(By.cssSelector(".nI-gNb-log-reg")).click();
		driver.findElement(By.cssSelector("button.waves-effect")).click();
		driver.findElement(By.xpath("//input[contains(@class,'mobileInputt  ')]")).sendKeys("9437248583");
		driver.findElement(By.cssSelector("button.btn-primary.waves-effect.waves-light.btn-large.blue-btn.sndbtn ")).click();
		driver.findElement(By.xpath("//input[contains(@class,'mobileInput ')]")).sendKeys("9437248583");*/
		
		driver.findElement(By.cssSelector(".nI-gNb-log-reg")).click();
		driver.findElement(By.linkText("Login")).click();
		/*driver.findElement(By.cssSelector(".err-border")).sendKeys("apurvamishra21@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("91295@Ap");
		driver.findElement(By.cssSelector(".btn-primary.loginButton")).click();*/
		
		driver.findElement(By.id("usernameField")).sendKeys("apurvamishra21@gmail.com");
		
		driver.findElement(By.id("passwordField")).sendKeys("91295@Ap");
		
		WebElement login =driver.findElement(By.cssSelector("button.waves-effect.waves-light.btn-large.btn-block.btn-bold.blue-btn.textTransform"));
		login.click();
		//staleElementReferenceException
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.stalenessOf(login));
		//Thread.sleep(3000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("nI-gNb-sb__placeholder")));
		driver.findElement(By.className("nI-gNb-sb__placeholder")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Enter keyword / designation / companies']")).sendKeys("JAVA SELENIUM BDD CUCUMBER SDET RESTASSURED");
		
		//driver.findElement(By.xpath("(//input[contains(@class,'suggestor-input ')])[1]")).sendKeys("JAVA SELENIUM BDD CUCUMBER SDET RESTASSURED");
		driver.findElement(By.name("experienceDD")).click();
		driver.findElement(By.xpath("//span[text()='4 years']")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'suggestor-input ')])[2]")).sendKeys("Bengaluru");
		driver.findElement(By.cssSelector(".ni-gnb-icn.ni-gnb-icn-search")).click();
		
		driver.close();
	}

}
