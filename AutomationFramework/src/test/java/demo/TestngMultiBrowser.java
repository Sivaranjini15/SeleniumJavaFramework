 	package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngMultiBrowser {
	
	WebDriver driver = null;
	
	@Parameters("browsername")
	@BeforeTest
	public void setup(String browsername) {
		
		System.out.println("Browser name is : "+browsername);
		System.out.println("Thread id is : "+Thread.currentThread().getId());
		
		if(browsername.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\eclipse-workspace\\AutomationFramework\\drivers\\IE driver\\IEDriverServer.exe");
			
		 driver = new InternetExplorerDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\AutomationFramework\\drivers\\chrome driver\\chromedriver.exe");
			
		driver = new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\eclipse-workspace\\AutomationFramework\\drivers\\gecko driver\\geckodriver.exe");
		 	
	     driver = new FirefoxDriver();
			
		}
		
	}
	
	@Test
	public void test() {
		
		driver.get("https://www.google.com");
		System.out.println("Test Successful");
	}
	
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
	
	
	
	
	
	

}
