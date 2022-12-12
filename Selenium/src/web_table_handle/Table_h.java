package web_table_handle;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Table_h 
{

	public static void main(String[] args) throws IOException
	{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		 
		 
		 WebDriver driver = new ChromeDriver();
		 
		 
		 driver.get("https://datatables.net/extensions/fixedheader/examples/options/scrolling.html");
		 
		 
		 
		 
	
		 List<WebElement> t = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		 
		 Iterator<WebElement> table = t.iterator();
		
		while(table.hasNext()) 
		{
			System.out.println(table.next().getText());
		}
		
		 
	}
	
}
