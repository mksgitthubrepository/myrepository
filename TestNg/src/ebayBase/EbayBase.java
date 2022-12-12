package ebayBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ebayUtility.EbayUtility;
import neoStoxUtility.NeoStoxUtility;

public class EbayBase 
{
	
	protected static  WebDriver driver;
	
	public void chromebrowser() throws InterruptedException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		
	    driver = new ChromeDriver();
		
		driver.get(EbayUtility.readdatafromprop("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
	}
    
	
	public void edgebrowser() throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\edgedriver.exe");
		driver= new EdgeDriver();
		driver.get(EbayUtility.readdatafromprop("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void firefoxdriver() throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get(EbayUtility.readdatafromprop("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

}
