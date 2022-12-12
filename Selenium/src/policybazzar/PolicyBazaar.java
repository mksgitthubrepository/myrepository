package policybazzar;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import myPackage.Chromeoptions;
import waits.Fluent_wait;

public class PolicyBazaar 
{
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		
		
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("incognito");
		 
		 WebDriver driver = new ChromeDriver(options);
		 
		 driver.get("https://www.policybazaar.com/");
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 js.executeScript("window.scrollBy(0,300)");
		 
		 
		 
		 homepage h= new homepage(driver);
		 h.termlife();
		 
		 
		 File f=new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\Exsheet.xlsx");
		 
		Sheet sheet = WorkbookFactory.create(f).getSheet("Sheet1");
		 
		String key = sheet.getRow(0).getCell(0).getStringCellValue();
		
		String date = sheet.getRow(0).getCell(1).getStringCellValue();
		
		String no = sheet.getRow(0).getCell(2).getStringCellValue();
		
		
		
		Detailspage d=new Detailspage(driver);
		
		d.Details(key, date, no, no);
		
	d.buttonclick();
		
	
		
		
		
		

		 
		 
		 
		
	}

}
