package testsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:/Users/user/eclipse-workspace/AutomationFramework/drivers/gecko driver/geckodriver.exe" );
		
		WebDriver dr = new FirefoxDriver();
		
		dr.get("http://www.facebook.com");
		
		dr.findElement(By.name("email")).sendKeys("ranjini");
		
		dr.findElement(By.name("pass")).sendKeys("jnwi");
		
		dr.findElement(By.id("u_0_2")).click();
		

	}

}
