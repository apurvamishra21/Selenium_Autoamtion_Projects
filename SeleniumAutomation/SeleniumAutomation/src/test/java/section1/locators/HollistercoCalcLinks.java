package section1.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HollistercoCalcLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hollisterco.com/shop/wd");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		Actions actions = new Actions(driver);
//		actions.sendKeys(Keys.CONTROL.END).perform();can use this also 
		
		System.out.println("Total links on entire page --> " + driver.findElements(By.tagName("a")).size());
		////div[contains(@class,'footer__info-links')]
		WebElement footerdriver = driver.findElement(By.xpath("//div[contains(@class,'footer__info-links')]"));
		System.out.println("Total links on footer page --> " + footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver = driver.findElement(By.xpath("//div[contains(@class,'footer__info-links')]//ul[1]"));
		System.out.println("Total links in first column ---> " + columndriver.findElements(By.tagName("a")).size());
		
		////div[@class='hr']/following-sibling::ul
		//ul.icon-link-group-horizontal
		
		WebElement hollisterBrands = driver.findElement(By.xpath("//div[@class='hr']/following-sibling::ul"));
		System.out.println("Total links in brand section ---> " + hollisterBrands.findElements(By.tagName("a")).size());
		
		WebElement sociallinks = driver.findElement(By.cssSelector("ul.icon-link-group-horizontal"));
		System.out.println("Total social links  ---> " + sociallinks.findElements(By.tagName("a")).size());
		
		driver.close();
		

	}

}
/*
If for some reason, selenium throws an error that it cannot find the footer element OR if the footer
hidden (since it is at the bottom of the page), than you can use ‘Actions’ class to scroll to the bottom
of the page using below syntax:
Actions actions = new Actions(driver);
actions.sendKeys(Keys.CONTROL.END).perform();
Similarly we can further narrow down to count the links in only first column. If we hover over the
mouse over the <ul tag seen in the red box (in the figure below), you will notice that the links of
‘About’ column get highlighted. Now the parent of this <ul> tag is <ul> tag and the parent of this <ul>
tag is a <div. tag comprising of 3 classes. So our custom csspath would become:
.footer__info-links.grid-col.grid-col-2 ul ul*/