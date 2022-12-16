package assingment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Com_use_methods 
{

   public static void screenshort(WebDriver driver) throws IOException 
   {
	   File temp = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   Object r = RandomString.make(3);
	   File f=new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\scren\\ss"+r+".png");
	   
	   FileHandler.copy(temp, f);
   }
}
