package chromeDevTools;

import java.util.List;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v104.performance.Performance;
import org.openqa.selenium.devtools.v104.performance.model.Metric;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestEnablePerformanceMetrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		 
		
		 
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
		 
				DevTools devTools = ((ChromeDriver) driver).getDevTools();
				devTools.createSession();
			
				devTools.send(Performance.enable(Optional.of(Performance.EnableTimeDomain.TIMETICKS)));
				
				driver.get("http://google.com");
				
				
				List<Metric> metrics = devTools.send(Performance.getMetrics());
				
				metrics.forEach(metric ->System.out.println(metric.getName()+" : "+metric.getValue()));
				
				
				
				
	


	}

}
