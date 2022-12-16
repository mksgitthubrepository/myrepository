package assingment;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	  
	  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		 
		 
		 WebDriver driver = new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.get("https://demoqa.com/alerts");
         
	     driver.findElement(By.id("alertButton")).click();
	     
	     driver.switchTo().alert().accept();
	     
	     driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).click();
	     
	     driver.switchTo().alert().sendKeys("mukul");
	   
	     driver.switchTo().alert().accept();
	   
	     driver.findElement(By.xpath("(//li[@id='item-0'])[3]")).click();
	     
	     driver.findElement(By.id("messageWindowButton")).click();
	     
	     Set<String> cdw = driver.getWindowHandles();
	     
	     System.out.println(cdw);
	  
	     Iterator<String> id = cdw.iterator();
	      
	      String mpi = id.next();
	      String cwi = id.next();
	      
	       
	      driver.switchTo().window(cwi);
	      driver.close();
	      driver.switchTo().window(mpi);
	      
	  }
	
}
