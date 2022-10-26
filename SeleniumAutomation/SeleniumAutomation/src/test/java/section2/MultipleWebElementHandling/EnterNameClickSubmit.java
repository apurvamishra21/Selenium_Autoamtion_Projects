package section2.MultipleWebElementHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterNameClickSubmit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("name")).sendKeys("Swadheenta");
		driver.findElement(By.name("phone")).sendKeys("1234678990");
		driver.findElement(By.name("email")).sendKeys("apu@gmail.com");
		WebElement list = driver.findElement(By.name("country"));
		Select s = new Select(list);
		
		s.selectByValue("Afghanistan");
		driver.findElement(By.name("city")).sendKeys("Rourkela");
		driver.findElement(By.xpath("//div[@id='load_box']//input[@name='username']")).sendKeys("Swadheenta");
		driver.findElement(By.xpath("//div[@id='load_box']//input[@name='password']")).sendKeys("arzu");


		
		WebElement submit = driver.findElement(By.xpath("//div[@id='load_box']//input[@value='Submit']"));
		//alt xpath = //div[@id='load_box']/form[@id='load_form']/div/div/input[@type='submit']
		submit.click();
		System.out.println(submit.isEnabled());//true
		
		String successmsg = driver.findElement(By.xpath("//p[contains(text(),'This is just a dummy form, you just clicked SUBMIT BUTTON')]")).getText();
		System.out.println(successmsg);
		
		driver.close();

	}

}
