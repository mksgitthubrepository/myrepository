package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google 
{
	
	WebDriver driver;
	
	@Parameters("url")
    @Test
    public void test(String uname) 
    {
    	
		driver =new ChromeDriver();
		
    	driver.get(uname);
    	
    } 
	
}
