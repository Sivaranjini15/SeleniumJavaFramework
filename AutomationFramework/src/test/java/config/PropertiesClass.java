package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import testsample.FacebookLoginTest_testng;

public class PropertiesClass {
	
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) {
		
		getProperties();
		setProperties();
		getProperties();
	}
	
	public static void getProperties() {
		try {
			Properties prop = new Properties();
			String projectPath = System.getProperty("user.dir");
			InputStream ip = new FileInputStream(projectPath+"/src/test/java/config/config.properties");
			prop.load(ip);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			FacebookLoginTest_testng.browsername=browser;
		}catch(Exception exp) {
			
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
		    exp.printStackTrace();
		}
		
	}

	public static void setProperties() {
		
		try {
			OutputStream op = new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
		    prop.setProperty("browser", "chrome");
		    prop.store(op, null);
		} catch (Exception exp) {
		  System.out.println(exp.getMessage());
		  System.out.println(exp.getCause());
		  exp.printStackTrace();
		}
		
		
		
	}
}
