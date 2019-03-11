package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestngGroups {
	
	
	static WebDriver driver;
	
		

		public static void loadURL()
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chrome driver/chromedriver.exe");
		
	
	 driver = new ChromeDriver();
	
	driver.get("http://54.89.207.24/");
	driver.manage().window().maximize();
		}
		
	
	public  static void login()
	{
		driver.findElement(By.className("cta signup_login")).click();
		driver.findElement(By.id("email") ).sendKeys("jnirmalrajan+2@fleetstudio.com");
		driver.findElement(By.id("password") ).sendKeys("fleet");
		driver.findElement(By.className("btn-submit")).click();
		
	}
	
	public  static void testTabs() throws InterruptedException
	{
		driver.findElement(By.linkText("My Segments")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Deploy Tags")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Account Info")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Company Info")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Billing Info")).click();
		Thread.sleep(1000);
		
	}

	public  static void testUserLogo()
	{
		driver.findElement(By.id("user_avatar")).click();
	}
	
	public static void testMySeg() throws InterruptedException
	{
		driver.findElement(By.linkText("My Segments")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=\"just go to the filters\"]")).click();
		
	}

}	
