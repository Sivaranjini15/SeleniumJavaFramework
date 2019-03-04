import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserTest {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\eclipse-workspace\\AutomationFramework\\drivers\\gecko driver\\geckodriver.exe");
		 	
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\AutomationFramework\\drivers\\chrome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\eclipse-workspace\\AutomationFramework\\drivers\\IE driver\\IEDriverServer.exe");
		
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.google.com");
			
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		
		//findElements
		
		List<WebElement> list = driver.findElements(By.xpath("//input"));
		
		int count = list.size();
		
		System.out.println("Count of list : "+count);
		
		driver.findElement(By.name("btnK")).click();
		
		driver.close();
				
	}

}
