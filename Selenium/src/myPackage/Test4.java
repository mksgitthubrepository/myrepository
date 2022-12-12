package myPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
{
	
		public static void main(String[] args) throws IOException, InterruptedException

		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://collection.volvocars.com/en/accessories-6");
			driver.manage().window().maximize();

			//driver.findElement(By.name("Private")).click();

			Thread.sleep(2000);
			driver.findElement(By.xpath("https://collection.volvocars.com/en/accessories-6")).click();
		}
		
		
	}


