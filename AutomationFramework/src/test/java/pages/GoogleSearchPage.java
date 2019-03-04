package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	 private static WebElement obj = null;
	
	public static WebElement textbox(WebDriver driver) {
		
		obj = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		return obj;
		
	}
	
	public static WebElement button(WebDriver driver) {
		
	  obj = driver.findElement(By.name("btnK"));
	return obj;
	}
	

}
