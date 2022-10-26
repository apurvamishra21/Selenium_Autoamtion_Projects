package section1.WebDriverMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFullPageScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		//getScreenshot method is in FirefoxDriver class so if we use WebDriver interface then we need to type cast
		WebDriver driver = new FirefoxDriver();
		driver.get("https://way2automation.com");
		driver.manage().window().maximize();

		if(driver instanceof FirefoxDriver)
		{
			//Full page


			//File fullpage = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);OR
			File fullpage = ((HasFullPageScreenshot) driver).getFullPageScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fullpage, new File("./screenshot/fullpage.jpg"));

		}else if(driver instanceof ChromeDriver) {

			File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(pageScreenshot, new File("./screenshot/page.jpg"));

		}
 

	}

}
