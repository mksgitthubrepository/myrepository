package assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Policybazaar
{
	
	@Test
	public void test() throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		
		Actions a= new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("(//div[@class='prd-icon add shadowHandler short'])[1]"))).click().build().perform();
		
	Thread.sleep(3000);
      a.moveToElement(driver.findElement(By.id("nameAdd"))).click().sendKeys("john wick").build().perform();

      a.moveToElement(driver.findElement(By.name("dob"))).click().sendKeys("10/12/1999").build().perform();
      
      a.moveToElement(driver.findElement(By.id("mobileNo"))).click().sendKeys("8888888888").build().perform();
      a.moveToElement(driver.findElement(By.id("submitButton"))).click().build().perform();
		
	}

}
