package demo;
import org.testng.annotations.Test;

import demo.TestngGroups;
public class firstTc {
	
		

	@Test
	

		private static void firstExe() throws InterruptedException {
			// TODO Auto-generated method stub
			TestngGroups.loadURL();
			TestngGroups.login();
			TestngGroups.testTabs();
			TestngGroups.testUserLogo();
		
		}

}

