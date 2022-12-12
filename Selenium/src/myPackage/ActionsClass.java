package myPackage;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass
{

	

	public static void main(String[] args) throws InterruptedException 
    {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		 
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname"));
		
		
		WebElement un = driver.findElement(By.name("firstname"));
		
		WebElement pa = driver.findElement(By.name("lastname"));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(un).click().sendKeys("mukul").build().perform();
		
		a.moveToElement(un).keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).sendKeys("x").build().perform();
		
		a.moveToElement(pa).click().keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	                
	   
    }
	
	
	
}
