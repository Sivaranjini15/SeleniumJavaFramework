package testsample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesClass;
import pages.FacebookLoginPage;

public class FacebookLoginTest_testng {
	
	WebDriver Driver = null;
	public static String browsername=null;

	
	@BeforeTest
	
	public void bfTest() {
		
		PropertiesClass.getProperties();
		if(browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\AutomationFramework\\drivers\\chrome driver\\chromedriver.exe");
			Driver = new ChromeDriver(); 
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:/Users/user/eclipse-workspace/AutomationFramework/drivers/gecko driver/geckodriver.exe");
			Driver = new FirefoxDriver();
		}

		
		
	}
	
	@Test
	
    public void onProtest() {
	
	Driver.get("http://www.facebook.com");
	
	Driver.findElement(By.name("email")).sendKeys("ranjini");
	
	Driver.findElement(By.name("pass")).sendKeys("jnwi");
	
	Driver.findElement(By.id("u_0_2")).click();
	
    }
	
	@AfterTest
	
	public void afTest() {
		
		Driver.close();
		
	}
	
		
}
	



