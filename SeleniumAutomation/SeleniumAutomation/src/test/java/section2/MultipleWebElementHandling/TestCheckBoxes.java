package section2.MultipleWebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckBoxes {
	
	public static WebDriver driver;
	
	public static boolean isElementPresent(By by) {
		/*try {
		driver.findElement(By.xpath(locator));
		return true;
		}catch(Throwable t) {
			
			return false;
		}*/
		
		int size = driver.findElements(by).size();
		if(size==0) {
			
			return false;
		}else {
			
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

		/*	driver.findElement(By.xpath("//div[4]/input[1]")).click();
			
			driver.findElement(By.xpath("//div[4]/input[2]")).click();
			
			driver.findElement(By.xpath("//div[4]/input[3]")).click();
			
			driver.findElement(By.xpath("//div[4]/input[4]")).click();
	*/		
			
			/*
			for(int i=1; i<=4; i++) {
			
				driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
				
				
			}*/
			
			/*int i=1;
			int count=0;
			
			while(isElementPresent(By.xpath("//div[4]/input["+i+"]"))) {
				
				driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
				i++;
				count++;
			}

			System.out.println("Total checkboxes are : "+count);*/
		
		WebElement block = driver.findElement(By.xpath("//div[@class='codewrap']/..//div[4]"));
		List<WebElement> checkBoxes = block.findElements(By.name("sports"));

		System.out.println("Total checkboxes are : "+checkBoxes.size());
		
		for(WebElement checkbox: checkBoxes) {
			
			checkbox.click();
			
		}

	}

}
