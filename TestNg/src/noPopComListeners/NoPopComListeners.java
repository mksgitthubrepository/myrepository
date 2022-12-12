package noPopComListeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import noPopComUtility.NoPopComUtilityClass;
import noPopCommerceBase.NoPopComBase;

public class NoPopComListeners extends NoPopComBase implements ITestListener
{
	
	
	    public void onStart(ITestContext context)
		{
			
			Reporter.log("Test is started....",true);
			
		}
		
		
		public void onTestStart(ITestResult result) 
		{
		
			Reporter.log("Test Case execution  is started...."+result.getName(),true);
			
		}
		
		
		
		public void onTestSuccess(ITestResult result) 
		{
			
			Reporter.log("Test Case is passed...."+result.getName(),true); 
			
			try {
				NoPopComUtilityClass.takescreenshort(driver, result.getName());
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
			
		}
		
		public void onTestFailure(ITestResult result)
		{
			Reporter.log("Test Case is failed...."+result.getName(),true);
		}
		
		public void onTestSkipped(ITestResult result) 
		{
			
			Reporter.log("Test Case is skipped...."+result.getName(),true);
		}
		
		public void onFinish(ITestContext context) 
		{
			
			Reporter.log("Test is finished....",true);
			
		}

	}
	
