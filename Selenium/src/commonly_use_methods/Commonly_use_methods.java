package commonly_use_methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Commonly_use_methods 
{
	
	public static void screenshort(WebDriver driver) throws IOException 
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File f=new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\scren\\scr1.png");
		
		FileHandler.copy(src, f);
		
		
		
		
	}

}
