package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.safari.SafariDriver;

public class Selenium 
{
	
	
	public static void main(String[] args)
	{
		
		
		WebDriver driver = new ChromeDriver();
		
		
		String cpath = SeleniumManager.getInstance().getDriverPath("chromedriver");
		driver.get("https://google.com");
		
		WebElement search = driver.findElement(By.xpath("//div[@class='SDkEP']"));
		
		
		System.out.println(search.getRect().getDimension().getHeight());
		System.out.println(search.getRect().getDimension().getWidth());
	}

}
