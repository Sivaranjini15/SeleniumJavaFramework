package config;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


public class DmpProperties {
	
	static Properties pro = new Properties();
	static String projectPath = System.getProperty("user.dir"); 
	
	public static void main(String[] args) {
			getProperties();
			setProperties();	
		}


	public static void getProperties() {
		
		Properties pro= new Properties();
		String projectPath = System.getProperty("user.dir");
		try {
			InputStream input = new FileInputStream(projectPath+"src/test/java/config/dmpconfig.properties");
			pro.load(input);
			String tab=pro.getProperty("tab");
			System.out.println(tab);	
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
		public static void setProperties() {
			
			try {
				OutputStream output = new FileOutputStream(projectPath+"src/test/java/config/dmpconfig.properties");
			    pro.setProperty("tab", "Billing Info");
			    pro.store(output, null);
			} catch (Exception exp) {
			  System.out.println(exp.getMessage());
			  System.out.println(exp.getCause());
			  exp.printStackTrace();
			}
	}
	
}
