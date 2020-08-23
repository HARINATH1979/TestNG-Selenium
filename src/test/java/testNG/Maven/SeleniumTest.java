package testNG.Maven;

import org.testng.annotations.Test;


public class SeleniumTest {
	@Test(groups = {"checkintest" })
	public void seleniumTest1()
	{
	System.out.println("seleniumTest1-checkintest");	
	}
	
	@Test(groups = { "checkintest" })
	public void seleniumTest2()
	{
	System.out.println("seleniumTest2-checkintest");	
	}

}
