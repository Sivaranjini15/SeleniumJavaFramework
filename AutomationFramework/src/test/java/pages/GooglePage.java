package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePage {
	
	WebDriver driver = null;
	
	By textbox = By.name("q");
	
	By button = By.name("btnK");
	
	public GooglePage(WebDriver dr) {
		
		driver = dr;
	}
	
	public void getSomeText(String text) {
		
		driver.findElement(textbox).sendKeys("text");
	}
	
	public void clickonbutton() {
		
		driver.findElement(button).sendKeys(Keys.RETURN);
	}
	
}
