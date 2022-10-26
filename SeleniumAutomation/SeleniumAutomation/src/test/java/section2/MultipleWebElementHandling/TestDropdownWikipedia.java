package section2.MultipleWebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropdownWikipedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		//can do this on makemytrip.com
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement languageDD = driver.findElement(By.id("searchLanguage"));
		
		Select select = new Select(languageDD);
		//select.selectByVisibleText("Eesti");
				select.selectByVisibleText("English");
				
				List<WebElement> values = languageDD.findElements(By.tagName("option"));
				
				//0 - size-1(61-1=60)
				System.out.println("Total values are : "+values.size());
				
				System.out.println(values.get(7).getText());//returns the 8th value which is at index 7 a single webelement
				
				
				for(int i=0; i<values.size(); i++) {
					
					System.out.println(values.get(i).getAttribute("lang"));
					
				}
		
		driver.close();
		
		
	}

}
/*Total values are : 71
?????
af
pl
ar
ast
az
bg
nan
bn
be
ca
cs
cy
da
de
et
el
en
es
eo
eu
fa
fr
gl
ko
hy
hi
hr
id
it
he
ka
la
lv
lt
hu
mk
arz
ms
min
my
nl
ja
nb
nn
ce
uz
pt
kk
ro
ru
en
ceb
sk
sl
sr
sh
fi
sv
ta
tt
th
tg
azb
tr
uk
ur
vi
vo
war
yue
zh*/