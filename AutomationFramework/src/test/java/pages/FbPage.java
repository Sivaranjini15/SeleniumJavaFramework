package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbPage {
      
	WebDriver driver = null;
	
	public FbPage(WebDriver driver1) {
		
		driver = driver1;
	}

	By textbox1 = By.id("email");
	
	By textbox2 = By.id("pass");
	
	By button = By.id("u_0_2");
	
	public void enterText1(String text) {
		
		driver.findElement(textbox1).sendKeys("");
	}
	
	public void enterText2(String text) {
		
		driver.findElement(textbox2).sendKeys("");
		
	}
	
	public void clickOnButton1() {
		
		driver.findElement(button).click();
	}
}