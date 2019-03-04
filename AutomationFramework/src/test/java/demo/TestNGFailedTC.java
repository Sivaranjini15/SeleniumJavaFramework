package demo;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGFailedTC {
	
	@Test
	public void Test1() {
	
		System.out.println("I am inside Test1");
	}

	@Test(retryAnalyzer = listeners.Retrylogic.class)
	public void Test2() {
		
		System.out.println("I am inside Test2");
		int i = 1/0;
		
	}
	
	@Test
	public void Test3() {
		
		System.out.println("I am inside Test3");
		//`Assert.assertTrue(false);
		
	}
}
