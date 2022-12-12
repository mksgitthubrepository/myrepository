package myPackage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class My_first_Selenium_code  
{
	
	public static void main(String[] args) throws IOException, InterruptedException 
 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		 
	    WebDriver driver =new ChromeDriver();
	    
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    driver.get("https://login-v2.upstox.com/");
	    
	    File f=new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\Book1.xlsx");
	    
	   Sheet sheet = WorkbookFactory.create(f).getSheet("Sheet1");
	    
	    
	    String id = sheet.getRow(0).getCell(0).getStringCellValue();
	    
	    String password = sheet.getRow(0).getCell(1).getStringCellValue();
	    
	    String yob = sheet.getRow(0).getCell(2).getStringCellValue();
	    
	    
	    driver.findElement(By.id("userCode")).sendKeys(id);
	    
	    driver.findElement(By.name("password")).sendKeys(password);
	    
	    driver.findElement(By.id("submit-btn")).click();
	    
	    driver.findElement(By.id("yob")).sendKeys(yob);
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
	    
	    
	    String userid = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();
	    
	    
	    String expected = "Nitin Z.";
	    
	    
	    if(userid.equals(expected)) 
	    {
	    	System.out.println("authorized user");
	 
	    }
	    else 
	    {
	    	System.out.println("user is not authorized");
	    }
	    
	    driver.findElement(By.linkText("Funds")).click();
	    
	    String funds = driver.findElement(By.xpath("(//div[@class='p7cB0_D8KuO320HW5wMAn _2LGu0XPz7mYgXhRukvReqt']//div)[2]")).getText();
		
	    System.out.println("funds available"+funds);
	    
	}   

}
