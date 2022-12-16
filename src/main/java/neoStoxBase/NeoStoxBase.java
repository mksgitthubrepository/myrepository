package neoStoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import neoStoxUtility.NeoStoxUtility;

public class NeoStoxBase 
{
	
	
	protected static WebDriver driver;       //access of driver should be protected 
	
	public void chromebrowser() throws InterruptedException     //base class method should be non static  
, IOException
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(NeoStoxUtility.readdatafromutility("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
    }
	
	public void edgebrowser() throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\edgedriver.exe");
		driver= new EdgeDriver();
		driver.get(NeoStoxUtility.readdatafromutility("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void firefoxdriver() throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get(NeoStoxUtility.readdatafromutility("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	

}
