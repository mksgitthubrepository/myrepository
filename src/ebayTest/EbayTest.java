package ebayTest;


import static org.testng.Assert.assertEquals;


import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ebayBase.EbayBase;
import ebayPom.EbayHomePage;
import ebayPom.EbayPage;
import ebayPom.EbayPassword;
import ebayPom.EbayProductPage;
import ebayPom.EbayUsername;
import ebayUtility.EbayUtility;

@Listeners(testNGListeners.TestNGListeners.class)

public class EbayTest extends EbayBase 


{
	EbayPage ebay;
	EbayUsername uname;
	EbayPassword pwd;
	EbayHomePage home;
	EbayProductPage product;
	
	
	
	
	@BeforeClass
	public void browserlaunch() throws InterruptedException ,IOException
	{
		
		chromebrowser();
		
		
		uname= new EbayUsername(driver);
		pwd= new EbayPassword(driver);
		home=new EbayHomePage(driver);
		product=new EbayProductPage(driver);
		ebay=new EbayPage(driver);
		
		
		
	}
	@BeforeMethod
	public void loginactivity() throws InterruptedException, IOException 
	{   
		ebay.signin();
		EbayUtility.implicitwait(driver);
		uname.enterusername(driver, EbayUtility.readdatafromprop("username"));
		uname.continuebutton();
	    Thread.sleep(2000);
	    pwd.enterpassword(driver,EbayUtility.readdatafromprop("password"));
	    pwd.clicksignin();
	    
		
		
	}
	@Test(priority=-1)
	public void validation() throws IOException, InterruptedException 
	{
		String expectedname=EbayUtility.readdatafromprop("name");
		
		String actualname = home.name(driver);
	
		assertEquals(actualname, expectedname,"actual & expected username not matching TC fail");
		
		
	}
	
	
	    @Test
		public void getprice() throws IOException, InterruptedException 
		{
	    	home.search(driver, EbayUtility.readdatafromprop("data"));
			home.searchbutton();
			product.phone(driver);
			
		
			
			
		}
		
	@AfterMethod
	public void Signout() throws InterruptedException 
	{
		home.logout();
		
	}
	
	
	
	@AfterClass
	public void closebrowser() 
	{
		driver.close();
		
	}
	

}




















