package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FacebookLoginPage {
	
	 private static WebElement element = null;
	
	public static WebElement textbox_t1(WebDriver Driver) {
		
		element = Driver.findElement(By.name("email"));
		
		return element;
	
	}
	
	public static WebElement textbox_t2(WebDriver Driver) {
		
		element = Driver.findElement(By.name("pass"));
		
		return element;
	}
	
	public static WebElement login(WebDriver Driver) {
	
    element = Driver.findElement(By.id("u_0_2"));
    return element;
    
	}
}
