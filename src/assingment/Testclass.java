package assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass 

{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		
		WebDriver driver = new ChromeDriver();				
	    driver.get("https://neostox.com/sign-up");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("ctl00$MainContent$signinsignup$txt_mobilenumber")).sendKeys("7057101311");
		
		driver.findElement(By.id("lnk_signup1")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("txt_accesspin")).sendKeys("1234");
		driver.findElement(By.id("lnk_submitaccesspin")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("(//button[@class='close'])[19]//span")).click();
		driver.findElement(By.xpath("(//a[@class='neobutton'])[25]")).click();
		
	}

}
