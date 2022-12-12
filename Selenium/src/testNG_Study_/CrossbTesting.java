package testNG_Study_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbTesting
{
	WebDriver driver;
	
	@Parameters ("browsername")
	@Test
	public void test(String browser) 
	{
		
		if(browser.equals("chrome")) 
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
			 
			 
			  driver = new ChromeDriver();
			  
	    }
		else if(browser.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\geckodriver.exe");
			 
			 
			  driver = new FirefoxDriver();
		}
		else if(browser.equals("edge")) 
		{
			System.setProperty("webdriver.msedge.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\msedgedriver.exe");
			 
			 
			  driver = new EdgeDriver();
		}
		
		driver.get("https://google.com");
		
		
	}
	

}
