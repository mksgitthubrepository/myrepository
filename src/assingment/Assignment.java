package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment
{
	
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(3000);
		
		WebElement button = driver.findElement(By.xpath("(//div[@class='a-cardui-body'])[4]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",button);
		
		
		org.openqa.selenium.Dimension d= new org.openqa.selenium.Dimension(500, 300);
		
		driver.manage().window().setSize(d);
		
		
		Point p =new Point(1000,500);
		
		driver.manage().window().setPosition(p);
          		
           
	}

}
