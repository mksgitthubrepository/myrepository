package noPopCommerceBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import noPopComUtility.NoPopComUtilityClass;

public class NoPopComBase 
{
          protected static WebDriver driver;
	
	   public void launchbrowser() throws IOException
	   
	{
		
		   driver = new ChromeDriver();
		   
		   driver.get(NoPopComUtilityClass.getdatafrompropfile("url"));
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   
		   
    }
	
}
