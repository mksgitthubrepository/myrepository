package noPopComUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Listeners;



public class NoPopComUtilityClass 
{
	
	
	
	
	public static String getdatafrompropfile(String key) throws IOException 
	{
		
		Properties p =new Properties();
		
	     FileInputStream file = new FileInputStream("C:\\Users\\MUKUL\\eclipse-workspace\\TestNg\\src\\noPopcommerce.properties");
	     
	    p.load(file);
		
		String value = p.getProperty(key);
		return value;
	}
	
	
	public static void scroll(WebDriver driver ,WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		 js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void takescreenshort(WebDriver driver,String ssname) throws IOException 
	{
		
		
		  File temp = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  File des =new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\scren\\"+ssname+".png");
		  
		  FileHandler.copy(temp, des);
	}
	
		
		
	}


