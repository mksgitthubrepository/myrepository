package testNGListeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import ebayBase.EbayBase;
import ebayUtility.EbayUtility;
import noPopCommerceBase.NoPopComBase;
import noPopCommerceTest.NoPopCommerceTest;

public class TestNGListeners extends EbayBase implements ITestListener
{
	
	@Override
	public void onStart(ITestContext context)
	{
		
		Reporter.log("hi im listener class test is started....",true);
		
	}
	
	@Override
	public void onTestStart(ITestResult result) 
	{
	
		Reporter.log("hi im listener class test case execution  is started...."+result.getName(),true);
		
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		Reporter.log("im listener class test case is passed...."+result.getName(),true); 
		
		try {
			EbayUtility.takescreenshort(driver, result.getName());
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("im listener class test case is failed...."+result.getName(),true);
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
		Reporter.log("im listener class test case  is skipped...."+result.getName(),true);
	}
	@Override
	public void onFinish(ITestContext context) 
	{
		
		Reporter.log("im listener test is finished....",true);
		
	}

	

}
