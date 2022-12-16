package listBoxhandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Reviews 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
        driver.get("https://vctcpune.com/");
        
        driver.findElement(By.linkText("Start Selenium Practice")).click();
        
        Set<String> id = driver.getWindowHandles();
		
	    Iterator<String> ids = id.iterator();
	
	    @SuppressWarnings("unused")
		String mpi = ids.next();
	
        String cpi = ids.next();
        
        driver.switchTo().window(cpi);
        
        driver.findElement(By.id("autocomplete")).sendKeys("mukul");
        
        
        Actions a= new Actions(driver);
        
        
        a.moveToElement(driver.findElement(By.id("autocomplete"))).click().keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
        
        
        a.moveToElement( driver.findElement(By.id("name"))).click().keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	}
	

}
