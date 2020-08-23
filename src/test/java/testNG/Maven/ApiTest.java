package testNG.Maven;

import org.testng.annotations.Test;


public class ApiTest {
	@Test(groups = { "functest", "checkintest" })
	public void apiTest1()
	{
	System.out.println("apiTest1 -functest/checkintest");	
	}
	
	@Test(groups = { "functest" })
	public void apiTest2()
	{
	System.out.println("apiTest2-functest");	
	}


}
