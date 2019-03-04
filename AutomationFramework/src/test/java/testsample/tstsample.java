package testsample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tstsample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\AutomationFramework\\drivers\\chrome driver\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("http://www.google.com");
		
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Testing");
		
		List<WebElement> links = dr.findElements(By.tagName("a"));
		
		//for each statement
		
		for (WebElement currlinks : links) {
			
		String strlinks = currlinks.getText();
			
		System.out.println(strlinks);
		
		}
		
		dr.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
		dr.close();
		
		

	}

}
