package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle
{

	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		 
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dh = driver.findElement(By.id("multiselect1"));
		
		Select dd=new Select(dh);
		
		System.out.println(dd.isMultiple());
		
		
		dd.selectByIndex(0);
		dd.selectByValue("swiftx");
		dd.selectByVisibleText("Hyundai");
		
		System.out.println(driver.findElement(By.xpath("//option[@value='volvox']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//option[@value='swiftx']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//option[@value='Hyundaix']")).isSelected());
		
		dd.deselectAll();
		
		
		
		
	}
	
	
}
