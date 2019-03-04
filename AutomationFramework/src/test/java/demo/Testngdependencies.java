package demo;

import org.testng.annotations.Test;

public class Testngdependencies {
	
	@Test(dependsOnGroups = {"Load.*"})
	public void testing1() {
		
		System.out.println("Tes1 is completed");
		
	}
	
	@Test(groups = {"Load1"})
	public void auto() {
		
		System.out.println("Test2 is completed");
		
	}
	
	@Test(groups = {"Load1"})
	public void man() {
		
		System.out.println("Test3 is completed");
		
	}
	
	@Test(groups = {"Load2"})
	public void man1() {
	
		System.out.println("Test4 is completed");
		
	}
	
	@Test
	public void man5() {
	
		System.out.println("Test5	 is completed");
		
	}

}
