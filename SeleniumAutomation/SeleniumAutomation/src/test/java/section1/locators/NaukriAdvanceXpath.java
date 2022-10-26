package section1.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriAdvanceXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
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
		wait.until(ExpectedConditions.stalenessOf(login));

		driver.findElement(By.className("nI-gNb-sb__placeholder")).click();
		//TC_01
		driver.findElement(By.cssSelector("input[placeholder='Enter keyword / designation / companies']")).sendKeys("JAVA SELENIUM BDD CUCUMBER SDET RESTASSURED");
		
		//driver.findElement(By.xpath("(//input[contains(@class,'suggestor-input ')])[1]")).sendKeys("JAVA SELENIUM BDD CUCUMBER SDET RESTASSURED");
		driver.findElement(By.name("experienceDD")).click();
		driver.findElement(By.xpath("//span[text()='4 years']")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'suggestor-input ')])[2]")).sendKeys("Bengaluru");
		driver.findElement(By.cssSelector(".ni-gnb-icn.ni-gnb-icn-search")).click();
		
		Thread.sleep(3000);
		//TC02
		driver.findElement(By.xpath("//a[starts-with(@class,'recruiterBlock')]")).click();
		driver.findElement(By.xpath("//div[@id='recruiterActions']//div[@class='ja-tags']/span[5]/span[text()='Contacted by Email']")).click();
		driver.findElement(By.xpath("//div[@class='ja-tags']/../following-sibling::div[1]/div/div/div")).click();

		driver.close();

	}

}
