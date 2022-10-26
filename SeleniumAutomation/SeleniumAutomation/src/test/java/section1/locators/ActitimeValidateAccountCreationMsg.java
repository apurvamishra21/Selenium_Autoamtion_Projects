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

public class ActitimeValidateAccountCreationMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int uniqueNum = (int)(Math.random() * 100000);
		String firstName = "veer" + uniqueNum;
		String lastName = "jay" + uniqueNum;
		String email = "vj@gmail" + uniqueNum;


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("admin" , Keys.TAB , "manager" , Keys.TAB , Keys.SPACE , Keys.ENTER);

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));


		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("container_users")));
		//.addNewButton
		driver.findElement(By.id("container_users")).click();
		////div[text()='New User']
		//div.components_button.withPlusIcon>div:first-child

		driver.findElement(By.cssSelector("div.components_button.withPlusIcon>div:first-child")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("createUserPanel_firstNameField")));

		driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys(firstName);


		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("createUserPanel_lastNameField")));
		driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys(lastName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("createUserPanel_emailField")));
		driver.findElement(By.id("createUserPanel_emailField")).sendKeys(email);
		////div[@class='timeTrackApprovalSetting']//td[2]/div[@class='components_switcher small off disabled animated']
		//div[class='components_switcher small off animated']
		driver.findElement(By.cssSelector("div[class='components_switcher small off animated']")).click();
		////div[text()='Save & Send Invitation']
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
		//div.createUserPanel_accountCreatedContainer > div:nth-child(3)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.createUserPanel_accountCreatedContainer > div:nth-child(3)")));
		String successmsg = driver.findElement(By.cssSelector("div.createUserPanel_accountCreatedContainer > div:nth-child(3)")).getText();
		if(successmsg.contains("The invitation has been sent to the user's email address:"))
		{
			System.out.println("validation pass");
		}else {
			System.out.println("validation fail");
		}

		driver.close();

		//The invitation has been sent to the user's email address: nnnmm@gmail.com

	}

}
