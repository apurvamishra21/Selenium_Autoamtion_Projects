package section1.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginRemotePCImpQ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.remotepc.com/");
		driver.manage().window().maximize();
		//(//a[text()='HelpDesk'])[1]
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("HelpDesk")).click();
		//a.topsignup
		////a[text()='Sign Up']
		////div[@class='mobile_header']//ul/li[4]/a
		////div[@class='mobile_header']//ul/li[4]/a[text()='Sign Up']
		driver.findElement(By.xpath("//ul[@class='nav_secondary']/li[2]/a")).click();
		////div[@class='plan-opts']/div/label/input[contains(@id,'fr')]
		////p[text()='7-Day Free trial']
		////div[@class='plan-opts']/div/label/p[text()='7-Day Free trial']
		////p[text()='7-Day Free trial']/../../../../../div/div/div[1]/label[1]/p
		////form[@id='singUpCMD']/div[1]/div[1]/div[1]/label/p
		//(//p[contains(text(),'Technicians')])[2]/../../../div[1]/label[contains(@for,'fr')]/p[text()='7-Day Free trial']
		driver.findElement(By.xpath("(//p[contains(text(),'Technicians')])[2]/../../../div[1]/label[contains(@for,'fr')]/p[text()='7-Day Free trial']")).click();
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.(By.xpath("//p[text()='7-Day Free trial']")));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//p[contains(text(),'Technicians')])[2]/../../../div[1]/label[contains(@for,'fr')]/p[text()='7-Day Free trial']")));
		}catch(TimeoutException e) {
			
		}
		driver.close();
		

	}

}
