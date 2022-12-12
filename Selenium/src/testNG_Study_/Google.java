package testNG_Study_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google
{


	@Test
	public void test() 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		 
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
    }
	@Test
	public void test2() 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		 
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
	
	}
}
