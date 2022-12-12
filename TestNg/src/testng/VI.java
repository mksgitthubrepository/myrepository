package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class VI 
{
	 
		@Test
		public void VI149()
		{
			
		    Reporter.log("VI recharge 28 days",true);
		}
		
		@Test(groups = "grp2")
		public void VI249() 
		{
			Reporter.log("VI recharge 35 days ",true);
		} 
		
		
		@Test
		public void VI449()
		{
			
		    Reporter.log("VI recharge 56 days",true);
		}
		
		@Test
		public void VI749() 
		{
			Reporter.log("VI recharge 84 days ",true);
		} 
	
	

}
