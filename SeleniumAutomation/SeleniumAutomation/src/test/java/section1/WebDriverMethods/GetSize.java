package section1.WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//div[placeholder='Try Saree, Kurti or Search by Product Code']
		WebElement search = driver.findElement(By.cssSelector("div[placeholder='Try Saree, Kurti or Search by Product Code']"));
		
		Dimension d = search.getSize();
		System.out.println(d.getHeight() + "------" + d.getWidth());
		
		Point p = search.getLocation();
		System.out.println(p.getX() + "-------------" + p.getY());
		
		Rectangle rec = search.getRect();
		
		System.out.println("Height is : " + rec.getHeight());
		System.out.println("Width is : " + rec.getWidth());
		System.out.println("X distance is : " + rec.getX());
		System.out.println("Y distance is : " + rec.getY());
		
		driver.close();
		

	}

}
/*
48------400
275-------------12
Height is : 48
Width is : 400
X distance is : 275
Y distance is : 12
*/