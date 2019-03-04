package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngparam {
	
	@Test
	@Parameters({"MyName"})
	public void test(@Optional("Arjun") String name) {
		
		System.out.println("Name is "+name);
	}

}
