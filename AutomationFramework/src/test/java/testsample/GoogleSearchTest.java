package testsample;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;
		
		public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\AutomationFramework\\drivers\\chrome driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		
		GoogleSearchPage.textbox(driver).sendKeys("Automation");
		
		
		GoogleSearchPage.button(driver).sendKeys(Keys.ENTER);
			

	}

}
