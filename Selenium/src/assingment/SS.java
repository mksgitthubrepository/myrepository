package assingment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SS 

{
	
	public static void main(String[] args) throws IOException
	{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		 
		 
		 WebDriver driver = new ChromeDriver();
		 
		 
		 driver.get("https://google.com");
		 
		 
		 WebElement img = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		 
	     File temp = img.getScreenshotAs(OutputType.FILE);
		 
		 File src =new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\scren\\sss.jpg");
		 
		 FileHandler.copy(temp, src);
		 
	}

}
