package testsample;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DMP {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
        String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chrome driver/chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testDMP() throws Exception {
    driver.get("http://54.89.207.24/");
    driver.findElement(By.linkText("sign up/log in")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("bpandian@fleetstudio.com");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("fleet");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remember me'])[1]/following::button[1]")).click();
    driver.findElement(By.id("react-tabs-2")).click();
    driver.findElement(By.id("react-tabs-4")).click();
    driver.findElement(By.id("react-tabs-6")).click();
    driver.findElement(By.id("react-tabs-8")).click();
    driver.findElement(By.id("react-tabs-10")).click();
    driver.findElement(By.id("react-tabs-12")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='My Segments'])[1]/preceding::img[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Manage Segments'])[2]/following::a[1]")).click();
    driver.close();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
