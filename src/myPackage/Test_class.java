package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_class 
{
	public static void main(String[] args) 
	{
		
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		 
	    WebDriver driver =new ChromeDriver();
	    
	    
	    driver.manage().window().maximize();
		driver .get("https://termlife.policybazaar.com/prequotes?utm_source=yahoo_brand&utm_medium=cpc&utm_term=policybazaar&utm_campaign=PolicyBazaar00PolicyBazaar&msclkid=528e1b0dd0d81468fb78787a71815c8f&utm_content=home_v11");
		
		
		driver.findElement(By.xpath("(//i[@class='radio'])[2]")).click();
		
		
		
		
	}
	
		 
		 
}


