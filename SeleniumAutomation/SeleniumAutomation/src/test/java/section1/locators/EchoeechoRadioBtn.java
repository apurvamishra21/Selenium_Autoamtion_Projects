package section1.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EchoeechoRadioBtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//capture all elements of group1
		
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		/*for(int i = 0 ; i < count ; i++) {
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			
		}*/
		//We can also print the values of all the 3 radios by using getAttribute method.
		//OR
		
		for(int i = 0 ; i < count ; i++) {
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			
		}
		//To click cheese
		
		for(int i = 0 ; i < count ; i++) {
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			
			if(text.equals("Cheese"))
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			
		}
		
		driver.close();

	}

}
