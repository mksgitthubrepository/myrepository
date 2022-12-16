package neoStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class NeoStoxUtility 
{
	

	
	public static String excel(int row,int cell) throws EncryptedDocumentException, IOException 
	{
		
	File f= new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\ns.xlsx");
	 
	   String value = WorkbookFactory.create(f).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
	
	   return value;
	}
	
	
	
	public static void takescreenshort(WebDriver driver,String ssname) throws IOException 
	{
		
		
		  File temp = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  File des =new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\scren\\"+ssname+".png");
		  
		  FileHandler.copy(temp, des);
	}
	
	public static void scroll(WebDriver driver ,WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		js.executeScript("arguments[0].scrollIntiView(true)",element);
	}
	
	public static void  Wait(WebDriver driver, int sec ) 
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		
		
	}
	public static String readdatafromutility(String key) throws IOException 
	{
		
		Properties p= new Properties();
		
		FileInputStream file= new FileInputStream("C:\\Users\\MUKUL\\eclipse-workspace\\TestNg\\NStox.properties");
		
		p.load(file);
		
		String value = p.getProperty(key);
		
		return value;
	}
	
	

}
