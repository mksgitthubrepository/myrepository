package myPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2
{
	public static void main(String[] args) throws IOException, InterruptedException 
	  
	  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		 
		 
		 WebDriver driver = new ChromeDriver();
		 
		 
		 driver.get("https://www.discoveryplus.in/");
		 
		 
		    WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		 
		
	      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[text()='Sign In'])[2]")));
		//w.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("(//h6[text()='Sign In'])[2]"), false));
	       
	       
	       driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
}
}
