package section1.locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewCustomerActitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int uniqueNum = (int)(Math.random() * 100000);
		String name = "veer" + uniqueNum;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin" , Keys.TAB , "manager" , Keys.TAB , Keys.SPACE , Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("container_tasks")));
		
		driver.findElement(By.id("container_tasks")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.addNewButton")));
		
		driver.findElement(By.cssSelector("div.addNewButton")).click();
		driver.findElement(By.cssSelector("div.createNewCustomer")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.newNameField")));
		//textarea[placeholder='Enter Customer Description']
		driver.findElement(By.cssSelector("input.newNameField")).sendKeys(name);
		
		driver.findElement(By.cssSelector("textarea[placeholder='Enter Customer Description']")).sendKeys("Swadheenta is a new customer");
		try {
			wait.until(ExpectedConditions.elementToBeSelected(By.cssSelector("textarea[placeholder='Enter Customer Description']")));
		}catch(TimeoutException e) {
			
		}
		//div.commitButtonPlaceHolder
		driver.findElement(By.cssSelector("div.commitButtonPlaceHolder")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+name+"']")));
		
		
		String customerName = driver.findElement(By.xpath("//div[text()='"+name+"']")).getText();
		System.out.println("Custometer created with name : " + customerName);
		
		if(customerName.equals(name)) {
			System.out.println("Customer Creation Pass");
		}else {
			System.out.println("Customer Creation Fail");
		}
		driver.close();
	
		
		

	}

}
