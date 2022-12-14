package section1.WebDriverMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;//change the import to static

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChainingRelativeLocators {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		/*WebElement above = driver.findElement(with(By.tagName("input")).above(By.tagName("select")));
		above.sendKeys("trainer@way2automation.com");
	
		WebElement below = driver.findElement(with(By.tagName("input")).below(By.tagName("select")));
		below.sendKeys("New Delhi");
		
		
		
		
		WebElement rightOf = driver.findElement(with(By.xpath("//input[@type='password']")).toRightOf(By.tagName("label")));
		rightOf.sendKeys("asfddsfsf");
		File rightScrn = rightOf.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(rightScrn, new File("./screenshot/right.jpg"));
		
		WebElement leftOf = driver.findElement(with(By.linkText("Signin")).toLeftOf(By.xpath("(//*[@id='load_form']/div[1]/div[2]/input)[2]")));
		File leftScrn = leftOf.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(leftScrn, new File("./screenshot/left.jpg"));
		leftOf.click();
		

		WebElement near = driver.findElement(with(By.partialLinkText("THE")).near(By.linkText("Signin")));
		near.click();*/
		
		
		//combining the locators
		
		driver.findElement(with(By.tagName("input"))
				.above(By.linkText("Signin"))
				.below(By.xpath("//*[@id='load_form']/fieldset[6]/input")))
				.sendKeys("ksdfksfdsdf");
						
						driver.close();
	}
 



		

	

}
