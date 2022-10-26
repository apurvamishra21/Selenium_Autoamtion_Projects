package com.Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Expedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();



		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.expedia.co.in/");
		
		

	}

}
/*
Our use case that we will automate:
---Navigate to https://www.expedia.co.in/
---click Flight+Hotel. The reason we have to click this is because, when selenium launches the site, it lands on ‘Hotels’ page by default (see figure 11b). However when we navigate to the site manually, we land up at ‘Flight + Hotel’ page by default

Figure 11b: Selenium behaviour, lands at ‘Hotels’ page

---Enter ‘c’ in the Origin field, select first option from dropdown
---Enter ‘on’ in the destination field, select first option from dropdown
---Enter departing date

Figure 12

---Click Search

Figure 13

---Lot of search results would come up as shown below

Figure 14

--- Our task is to search for the word ‘Hilton’ and click the hotel link from the search results. The hotel link would open in a new tab window

Figure 15

Let us automate these steps. Inspect ‘Flight + Hotel’ and create custom xpath


/input[name='package-type']
*/