package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class Selenium 
{
	
	
	public static void main(String[] args)
	{
		
		
		WebDriver driver = new ChromeDriver();
		
		
		@SuppressWarnings("unused")
		String cpath = SeleniumManager.getInstance().getDriverPath("chromedriver");
		driver.get("https://google.com");
		
		WebElement search = driver.findElement(By.xpath("//div[@class='SDkEP']"));
		
		
		System.out.println(search.getRect().getDimension().getHeight());
		System.out.println(search.getRect().getDimension().getWidth());
	}

}
