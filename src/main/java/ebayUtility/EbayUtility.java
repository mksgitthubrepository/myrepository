package ebayUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class EbayUtility 
{
	
	
		public static String readdatafromprop(String key) throws IOException 
		{
			
			Properties p=new Properties();
			
			FileInputStream f=new FileInputStream("C:\\Users\\MUKUL\\Desktop\\myworkspace\\maven\\ebay.properties");
			
			p.load(f);
			
			String value=p.getProperty(key);
			Reporter.log("reading data from properties file...", true);
			
			return value;
			
			
		}
		public static void implicitwait(WebDriver driver) 
		{
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
	
		public static void takescreenshort(WebDriver driver,String ssname) throws IOException 
		{
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\scren\\"+ssname+".png"));
			
		}
		public static void scroll(WebDriver driver ,WebElement element) 
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			
			 js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		
	
	
	

}

