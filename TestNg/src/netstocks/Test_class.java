package netstocks;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testng2.home_page;

public class Test_class 
{
	WebDriver driver;
	Sheet s;
	String num;
	String pass;
	String user;
	Sign_in_page si;
	Passcode_page p;
	Popup po1;
	Popup2 po2;
	Home_page h;
	
	@BeforeMethod
	public void beforemethod() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://neostox.com/sign-up");
		Thread.sleep(2000);
		File f= new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\neostocks.xlsx");
		
		      s = WorkbookFactory.create(f).getSheet("Sheet1");
		      num=s.getRow(0).getCell(0).getStringCellValue();
		      pass=  s.getRow(0).getCell(1).getStringCellValue();
		      user= s.getRow(0).getCell(2).getStringCellValue();
		      si= new Sign_in_page(driver);
		      si.enterid(num);
		      Thread.sleep(2000);
		      p=new Passcode_page(driver);
		      p.enterpasscode(pass);
		      Thread.sleep(2000);
		      po1=new Popup(driver);
		      po1.popupclose();
		      Thread.sleep(2000);
		      po2 =new Popup2(driver);
		      po2.ppclose();
		      Thread.sleep(2000);
		       h=new Home_page(driver);
		      
     }
	
	
	
	@Test
	public void test() 
	{
		String expectedname = user;
	
		String actualname = h.test(driver);

		assertEquals(expectedname, actualname);
	
		//Reporter.log("tc pass",true);
	}
	@AfterMethod
	public void logout() 
	{
		h.logout();
	}
	@AfterClass
	public void browserclose() 
	{
		driver.close();
		
	}

}
