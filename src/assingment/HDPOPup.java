package assingment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDPOPup 
{
	
	public static void main(String[] args) throws IOException, InterruptedException 
	  
	  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.redbus.com/");
		
		driver.findElement(By.xpath("//button[@class='sc-jTzLTM bfMZDh']")).click();
	    
	  }

}
