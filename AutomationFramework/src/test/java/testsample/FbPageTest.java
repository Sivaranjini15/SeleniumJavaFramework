package testsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FbPage;

public class FbPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		fbPageFn();
	
	}
	
	public static void fbPageFn() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\AutomationFramework\\drivers\\chrome driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
	
		FbPage fb = new FbPage(driver);
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		fb.enterText1("Arjun");
		
		fb.enterText2("Jeypal");
		
		fb.clickOnButton1();
		
	}

}
