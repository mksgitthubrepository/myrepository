package myPackage;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

public class Practice2 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		 
	    WebDriver driver =new ChromeDriver();
	    
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    driver.get("https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all");
	    
	   Actions a=new Actions(driver);
	    Thread.sleep(2000);
	   WebElement f = driver.findElement(By.xpath("(//div[@class='CodeMirror-code']//span)[1]"));
		 WebElement run = driver.findElement(By.xpath("//button[@class='ws-btn']"));
	                            
	   a.moveToElement(f).click().keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).sendKeys("x").build().perform();
	   Thread.sleep(2000);
	   a.moveToElement(f).click().keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	   Thread.sleep(2000);
	   run.click();
	   
	   
	}

}
