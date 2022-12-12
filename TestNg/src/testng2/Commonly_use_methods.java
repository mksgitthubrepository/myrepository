package testng2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Commonly_use_methods 
{
	
	
	public static void screenshort(WebDriver driver) throws IOException 
	{
		
	  File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  File f = new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\scren\\ss36.png");
	  
	  FileHandler.copy(s, f);
		
	}
	
	

}
