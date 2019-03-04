package testsample;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportwithTestNG {
	
	ExtentHtmlReporter htmlreporter;
	
	ExtentReports extent ;	
	
    @BeforeSuite
	public void setUp() {
    	
    	htmlreporter = new ExtentHtmlReporter("extent.html");
		 extent = new ExtentReports();
		extent.attachReporter(htmlreporter);

	}
    
	@Test
	public void test() throws IOException {
		
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		test.log(Status.INFO, "Starting Test Case");
		test.info("This step shows usage of info(details)");
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		
	}
	
	@Test
	public void test2() throws IOException {
		
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		test.log(Status.INFO, "Starting Test Case");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		
	}
	
    @AfterSuite
	public void tearDown() {
			
		extent.flush();	
			
		}
		
		
		
		
		
		
		
		
	}


