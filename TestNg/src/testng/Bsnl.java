package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bsnl 
{
	@Test
	public void bsnl149()
	{
		
	    Reporter.log("bsnl recharge 28 days",true);
	}
	
	@Test
	public void bsnl249() 
	{
		Reporter.log("bsnl recharge 35 days ",true);
	} 
	
	
	@Test
	public void bsnl449()
	{
		
	    Reporter.log("bsnl recharge 56 days",true);
	}
	
	@Test
	public void bsnl749() 
	{
		Reporter.log("bsnl recharge 84 days ",true);
	} 
	


}
