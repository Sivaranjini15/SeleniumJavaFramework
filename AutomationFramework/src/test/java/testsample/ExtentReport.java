	package testsample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
	// create ExtentReports and attach reporter(s)
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		// create a toggle for the given test, add all log events under it
		
		ExtentTest test1 = extent.createTest("Google Search Test One","this is a test to validate google search functionality");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\AutomationFramework\\drivers\\chrome driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 test1.log(Status.INFO, "Starting Test Case");
		 
		 driver.get("http://www.google.com");
		 
		 test1.pass("Navigated to google.com");
		 
		 driver.manage().window().maximize();
		 
		 test1.pass("Maximized the screen");
		 
		 driver.findElement(By.name("q")).sendKeys("Automation");
		 
		 test1.pass("Entered text in Searchbox");
		 
		 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		 
		 test1.pass("Pressed keyboard enter key");
		 
		 driver.close();
		 
		 driver.quit();
		
		 test1.pass("Closed the browser");
		 
		 test1.info("Test Completed");
		 
		 //calling flush writes everything to the log file
		 
		 extent.flush();
	}
		
	

}