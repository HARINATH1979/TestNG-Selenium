package testNG.Maven;

import org.testng.annotations.Test;


public class AppiumTest {
	@Test(groups = { "checkintest" })
	public void appiumTestt1()
	{
	System.out.println("appiumTestt1-checkintest");	
	}
	
	@Test(groups = { "functest", "checkintest" })
	public void appiumTestt2()
	{
	System.out.println("appiumTestt2-functest/checkintest");	
	}
}
