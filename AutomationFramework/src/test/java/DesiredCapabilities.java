import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DesiredCapabilities {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\eclipse-workspace\\AutomationFramework\\drivers\\IE driver\\IEDriverServer.exe");
	
	
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		driver.close();
		
		driver.quit();
	}

}
