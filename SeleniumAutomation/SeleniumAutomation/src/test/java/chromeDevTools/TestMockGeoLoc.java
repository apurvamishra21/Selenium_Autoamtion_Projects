package chromeDevTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v104.emulation.Emulation;

import com.google.common.base.Optional;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMockGeoLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://chromedevtools.github.io/devtools-protocol/tot/Emulation/
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				DevTools devTools = ((ChromeDriver) driver).getDevTools();
				devTools.createSession();
				
				
			//	devTools.send(Emulation.setGeolocationOverride(Optional.of((Number)(double)35.689487), Optional.of((Number)(double)139.691706), Optional.of(100)));
				//Optional.of(51.509865), Optional.of(-0.118092), Optional.of(100)));udemy
				driver.get("https://mycurrentlocation.net/");

	}

}
