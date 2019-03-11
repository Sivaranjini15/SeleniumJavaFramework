package testsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DMP_Testing {
	
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\git\\SeleniumJavaFramework\\AutomationFramework\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	
	 driver.get("http://54.89.207.24/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[2]")).findElement(By.xpath("/html/body/div[2]/div[3]/div/button[3]/span")).click();
           Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/ul/li[7]/a")).click();
	Thread.sleep(1000);
	    driver.findElement(By.id("email")).sendKeys("bpandian@fleetstudio.com");
	    Thread.sleep(1000);
	    driver.findElement(By.id("password")).sendKeys("fleet");
	    Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"overlay\"]/div/section/div/form/div[2]/button")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"react-tabs-2\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\"react-tabs-4\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\"react-tabs-6\"]")).click();
	     driver.findElement(By.xpath("//*[@id=\"react-tabs-8\"]")).click();
	     
	     Thread.sleep(2000);
	     WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"react-tabs-9\"]/div/div/section/div[2]/form/div[1]/div[3]/input"));
	     ele1.clear();
	     ele1.sendKeys("Siva");
	     Thread.sleep(1000);
	     WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"react-tabs-9\"]/div/div/section/div[2]/form/div[1]/div[4]/input"));
	     ele2.clear();
	     ele2.sendKeys("Ranjini");
	     Thread.sleep(1000);
	     WebElement ele3 = driver.findElement(By.xpath("//*[@id=\"react-tabs-9\"]/div/div/section/div[2]/form/div[1]/div[5]/input"));
	     ele3.clear();
	     ele3.sendKeys("abc@gmail.com");
	     Thread.sleep(1000);
	     WebElement ele4 = driver.findElement(By.xpath("//*[@id=\"react-tabs-9\"]/div/div/section/div[2]/form/div[1]/div[6]/input"));
	     ele4.clear();
	     ele4.sendKeys("XYZ Street");
	     Thread.sleep(1000);
	     WebElement ele5 = driver.findElement(By.xpath("//*[@id=\"react-tabs-9\"]/div/div/section/div[2]/form/div[1]/div[8]/input"));
	     ele5.clear();
	     ele5.sendKeys("Hello");
	     Thread.sleep(1000);
	     WebElement ele6 = driver.findElement(By.xpath("//*[@id=\"react-tabs-9\"]/div/div/section/div[2]/form/div[1]/div[9]/select"));
	     Select place = new Select(ele6);
	     place.selectByVisibleText("Georgia");
	     Thread.sleep(2000);
	     WebElement ele7 = driver.findElement(By.xpath("//*[@id=\"react-tabs-9\"]/div/div/section/div[2]/form/div[1]/div[10]/input"));
	     ele7.clear();
	     ele7.sendKeys("12345");
	     Thread.sleep(2000);
	     WebElement ele8 = driver.findElement(By.xpath("//*[@id=\"react-tabs-9\"]/div/div/section/div[2]/form/div[1]/div[11]/input"));
	     ele8.clear();
	     ele8.sendKeys("9876543210");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"react-tabs-9\"]/div/div/section/div[2]/form/div[2]/button")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"react-tabs-10\"]")).click();
	     driver.findElement(By.xpath("//*[@id=\"react-tabs-12\"]")).click();
	     Thread.sleep(5000);
	     //WebElement img = driver.findElement(By.id("user_avatar"));
	    // if(img.isEnabled())
	    // {
	    	// System.out.println("img is Enabled");
	    	 //img.click();
	    	 //System.out.println("img is clicked");
	     //}
	     //else
	     //{
	    	// System.out.println("img is not Enabled");
	     //}
	     //Thread.sleep(1000);
	     driver.findElement(By.xpath("(//img[@alt='User'])[2]")).click();
	     driver.findElement(By.xpath("//*[@id=\"user_profile\"]/div[4]/ul/li/a")).click();
	     driver.close();
	}
 		}
	

	

