package testsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GooglePage;

public class GooglePageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		googlesearch();
	}
			
		public static void googlesearch() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\AutomationFramework\\drivers\\chrome driver\\chromedriver.exe");
			
			  driver = new ChromeDriver();
			
			GooglePage goog = new GooglePage(driver);
			
           driver.get("http://www.google.com");
			
			driver.manage().window().maximize();
		
			goog.getSomeText("Miracle");
			
			goog.clickonbutton();
			
			Thread.sleep(2000);
			
			driver.close();
		}
}
	
	
	
	
	
	
	
	
	
	


