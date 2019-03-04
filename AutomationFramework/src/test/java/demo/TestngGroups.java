package demo;

import org.testng.annotations.Test;
@Test(groups = {"AllClassTests"})
public class TestngGroups {
	
	@Test(groups = {"windows.sanity"})
	public void test() {
		
		System.out.println("Test is completed");
	}

	@Test(groups = {"sanity"})
public void test1() {
		
		System.out.println("Test1 is completed");
	}

	@Test(groups = {"linux.sanity"})
public void test2() {
	
	System.out.println("Test2 is completed");
}

	@Test(groups = {"linux.smoke"})
public void test3() {
	
	System.out.println("Test3 is completed");
}

	@Test(groups = {"windows.sanity"})
public void test4() {
	
	System.out.println("Test4 is completed");
}

	@Test(groups = {"sanity","smoke"})
public void test5() {
	
	System.out.println("Test5 is completed");
}

}
