package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority 
{
	
	
	
	@Test(dependsOnMethods = "b")
	public void a() 
	{
		System.out.println("test case a");
	}
	@Test
	public void b() 
	{
		Assert.fail();
	}
	@Test
	public void c() 
	{
		
		System.out.println("test case c");
		
	}
	

}
