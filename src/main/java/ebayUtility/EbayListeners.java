package ebayUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import ebaybase.EbayBase;

public class EbayListeners extends EbayBase implements ITestListener
{
	
	
	public void onStart(ITestContext context)
	{
		
		Reporter.log("hi im listener class test is started....",true);
		
	}
	
	
	public void onTestStart(ITestResult result) 
	{
	
		Reporter.log("hi im listener class test case execution  is started...."+result.getName(),true);
		
	}
	
	
	
	public void onTestSuccess(ITestResult result) 
	{
		
		Reporter.log("im listener class test case is passed...."+result.getName(),true); 
		
		try {
			EbayUtility.takescreenshort(driver, result.getName());
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("im listener class test case is failed...."+result.getName(),true);
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		
		Reporter.log("im listener class test case  is skipped...."+result.getName(),true);
	}
	
	public void onFinish(ITestContext context) 
	{
		
		Reporter.log("im listener test is finished....",true);
		
	}

	

}