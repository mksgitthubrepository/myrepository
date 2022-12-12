package upx_exl_pom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import policybazzar.homepage;

public class Test_class 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\msedgedriver.exe");
		 
	    WebDriver driver =new EdgeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.manage().window().maximize();
	   	    
	    driver.get("https://login-v2.upstox.com/");
	    
	    File f= new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\Book1.xlsx");
	    
	    Sheet sheet1 = WorkbookFactory.create(f).getSheet("Sheet1");
	    
	    String usid = sheet1.getRow(0).getCell(0).getStringCellValue();
	    String passw = sheet1.getRow(0).getCell(1).getStringCellValue();
	    String year = sheet1.getRow(0).getCell(2).getStringCellValue();
	    
	    Sign_in_page sg=new Sign_in_page(driver);
	    
	    sg.enteruid(usid);
	    sg.enterpass(passw);
	    sg.signin();
	    
	  
	    
	    YOB_page y=new YOB_page(driver);
	    
	    y.year_of_birth(year);
	   
	   Welcome_page w= new Welcome_page(driver);
	   w.accept();
	    
		Home_page h=new Home_page(driver);
		
		
		
		
	}

}
