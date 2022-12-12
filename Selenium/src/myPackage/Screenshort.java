package myPackage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;


public class Screenshort 

{
  

    public static void main(String[] args) throws IOException
   {
	
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
	   
	   WebDriver driver =new ChromeDriver();
	   	   
	   driver.get("https://www.facebook.com/");
	   
	   String r=RandomString.make(2);
	   
	   driver.findElement(By.id("email")).sendKeys("7057101311");
	   
	   driver.findElement(By.id("pass")).sendKeys("12345");
	   
	   driver.findElement(By.name("login")).click();	   
	   
	   WebElement temp = driver.findElement(By.xpath("//div[@id='loginform']"));
	   
	    
	    File ss = temp.getScreenshotAs(OutputType.FILE);
	    
       
	    FileUtils.copyFile(ss, new File("C:\\Users\\MUKUL\\Desktop\\AUTO\\scren\\ss3"+r+".jpg"));
       
	   
	   
	 }
}
