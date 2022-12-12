package jsexecuter;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_exe

{

	public static void main(String[] args) throws IOException, InterruptedException 
	 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		 
	    WebDriver driver =new ChromeDriver();
	    
	    
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    
	    driver.manage().window().maximize();
	    JavascriptExecutor js = ((JavascriptExecutor)driver);
	   
	     WebElement element = driver.findElement(By.id("name"));
	     js.executeScript("arguments[0].scrollIntoView(true);", element);
	     Thread.sleep(3000);
	     js.executeScript("arguments[0].value='mukul';", element);
	    
	     WebElement button = driver.findElement(By.id("alertbtn"));
	     
	    js.executeScript("arguments[0].click();", button);
	     
	    
	    
	    
	    
	}
	
}
