package neoStoxTest;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import neoStoxBase.NeoStoxBase;
import neoStoxPom.Homepage;
import neoStoxPom.Passwordpage;
import neoStoxPom.Popup1;
import neoStoxPom.Popup2;
import neoStoxPom.Signinpage;
import neoStoxUtility.NeoStoxUtility;

public class NeoStoxTestClass extends NeoStoxBase
{
	
	
	Signinpage login;
	Passwordpage password;
	Popup1 p1;
	Popup2 p2;
	Homepage h;
	
	
	
	
	@BeforeClass
	public void launchbrowser1() throws InterruptedException, IOException
	{
		chromebrowser();
		
		login =new Signinpage(driver);
		
		password =new Passwordpage(driver);
		p1= new Popup1(driver);
		p2=new Popup2(driver);
		h =new Homepage(driver);
		
	}
	@BeforeMethod
	public void beforemethods() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
          login.entermobilenumber(driver, NeoStoxUtility.readdatafromutility("mobno"));
          login.signin();
          password.enterpasscode(driver, NeoStoxUtility.readdatafromutility("password"));
          Thread.sleep(2000);
          password.submitbutton();
          Thread.sleep(5000);
          p1.popupclose(driver);
          Thread.sleep(8000);
          p2.ppclose(driver);

          
		
	}

	@Test
	public void validation() throws EncryptedDocumentException, IOException 
	{
		String expectedname=NeoStoxUtility.excel(0,2);
	    String actualname=h.test(driver);
	    String name= actualname.substring(3);
	    System.out.println(name);
	    
	    assertEquals(actualname, expectedname,"actual name not equal to expectd name tc fail");
		
	    String expectedfund="Rs.5,00,000.00";
	    
	    String actualfunds=h.availablefunds(driver);
	   
		assertEquals(actualfunds,expectedfund);
		
	
		
	
	}
	@AfterMethod
	public void logout(ITestResult result) throws IOException 
	{
		
		if(ITestResult.FAILURE==result.getStatus()) 
		{
			NeoStoxUtility.takescreenshort(driver,"failedtestcase");
			
		}
		
		h.logout();
	}
	@AfterClass
	public void closebrowser() 
	{
		driver.close();
	}
}