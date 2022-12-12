package testng2;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.batik.util.HaltingThread;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_class 
{

	WebDriver driver;
	File f;
	Sheet s;
	Userid_page userd;
	Passcode_page pass;
	Welcome_page welcome;
	home_page h;
	String id;
	String pas;
	String year;
	String name;
	
	@BeforeClass
	public void launchbrowser() throws EncryptedDocumentException, IOException 
	{
		
		driver = new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    f= new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\Book1.xlsx");
		
		 s = WorkbookFactory.create(f).getSheet("Sheet1");
		 userd=new Userid_page(driver);
		 pass=new Passcode_page(driver);
		 welcome= new Welcome_page(driver);
		 h=new home_page(driver);
		 id = s.getRow(0).getCell(0).getStringCellValue();
		 pas = s.getRow(0).getCell(1).getStringCellValue();
		 year= s.getRow(0).getCell(2).getStringCellValue();
		 name=s.getRow(0).getCell(3).getStringCellValue();
	}
	
	
	@BeforeMethod
	public void beforemethod() 
	{
		
		userd.userid(id);
		Reporter.log("entering the id....",true);
		
		userd.password(pas);
		Reporter.log("entering the pass....",true);
		userd.signin();
		Reporter.log("signing in.... ",true);
		pass.yearofbirth(year);
		Reporter.log("entering the YOB....",true);
		welcome.accept();
		Reporter.log("accepting....",true);
	}
	@Test
	public void test() throws IOException
	{
		String expected_name = name;
		String actualname = h.actualname(driver);
		
		assertEquals(expected_name,actualname );
		
	}
	
	@AfterMethod
	public void aftermethod() 
	{
		h.dropd();
		h.logout();
	}
	
	@AfterClass
	public void afterclass() 
	{
		driver.close();
		
	}
	
	
	

}
