package testsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FacebookLoginPage;

public class FacebookLoginTest2 {
	
	private static WebDriver Driver = null;
	
public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\AutomationFramework\\drivers\\chrome driver\\chromedriver.exe");
	
	Driver = new ChromeDriver();
	
	Driver.get("http://www.facebook.com");
	
	//Driver.findElement(By.name("email")).sendKeys("ranjini");
	
	FacebookLoginPage.textbox_t1(Driver).sendKeys("ranjini");
	
	//Driver.findElement(By.name("pass")).sendKeys("dwbndwiu");
	
	FacebookLoginPage.textbox_t2(Driver).sendKeys("jiwigcx");
	
	//Driver.findElement(By.id("u_0_2")).click();
	
	FacebookLoginPage.login(Driver).click();
	
	Thread.sleep(2000);
	
	Driver.close();
	
	
	
	
}
	
} 


