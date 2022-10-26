package seleniumCodingChallenge;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceTestStream {

	@Test
	public void maxPriceStreamTest() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		//approach 1
		/*List<WebElement> priceList = driver.findElements(By.className("inventory_item_price"));
		
		double maxPrice = priceList
		.stream()
		.mapToDouble(e -> Double.parseDouble(e.getText().trim().replace("$", "")))
		.max()
		.getAsDouble();
		System.out.println(maxPrice);
		////div[contains(text(),49.99)]/following-sibling::button[text()='Add to cart'] is not identifying the element
		String xpath_max = "//div[normalize-space()='$"+maxPrice+"']/following-sibling::button[text()='Add to cart']";
		driver.findElement(By.xpath(xpath_max)).click();
		
		double minPrice = priceList
				.stream()
				.mapToDouble(e -> Double.parseDouble(e.getText().trim().replace("$", "")))
				.min()
				.getAsDouble();
		System.out.println(minPrice);
		
		String xpath_min = "//div[normalize-space()='$"+minPrice+"']/following-sibling::button[text()='Add to cart']";
		
		driver.findElement(By.xpath(xpath_min)).click();*/
		
		//approach 2
		List<WebElement> priceList = driver.findElements(By.className("inventory_item_price"));
		double largest = 0;
		for(WebElement e : priceList) {
			
			double price = Double.parseDouble(e.getText().replace("$", ""));
			if(largest < price) {
				largest = price;
			}
			
		}
		System.out.println(largest);
		String xpath_max = "//div[normalize-space()='$"+largest+"']/following-sibling::button[text()='Add to cart']";
		driver.findElement(By.xpath(xpath_max)).click();
		
		
		//sources - > new snippet
		//javascript -- inject JS code inside the browser using JSExecutor
		//Approach3
		String script = "var max = 0;\r\n"
				+ "		document.getElementsByClassName('inventory_item_price')\r\n"
				+ "		        .forEach(e => {newVal = parseFloat(e.innerText.split('$')[1]);\r\n"
				+ "		if(max < newVal){\r\n"
				+ "		    max = newVal;\r\n"
				+ "		}\r\n"
				+ "		                       });\r\n"
				+ "		console.log(max);\r\n"
				+ "		var xpathVal = \"//div[normalize-space()='$\"+max+\"']/following-sibling::button[text()='Add to cart']\";\r\n"
				+ "		var ele = document.evaluate( xpathVal , document , null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;\r\n"
				+ "		ele.click();";
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript(script);
		
		
		
		//driver.close();
	}

	}
	
	/*
	 * var max = 0;
document.getElementsByClassName('inventory_item_price')
        .forEach(e => {newVal = parseFloat(e.innerText.split('$')[1]);
if(max < newVal){
    max = newVal;
}
                       });
console.log(max);
var xpathVal = "//div[normalize-space()='$"+max+"']/following-sibling::button[text()='Add to cart']";
var ele = document.evaluate( xpathVal , document , null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;
ele.click();  */


