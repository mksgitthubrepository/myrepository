package setsize_setposition;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_size_Set_position 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		 
	    WebDriver driver =new ChromeDriver();
	
	    driver.get("https://www.google.co.in/");
	   
	    Dimension size = driver.manage().window().getSize();
	    
	    System.out.println(size);
	   
	    
//	    Dimension d= new  Dimension(1552,832);
//	    Thread.sleep(2000);
//	    driver.manage().window().setSize(d);
//	    
	    
	    Point position = driver.manage().window().getPosition();
	    
	    System.out.println(position);
	    Point p=new Point(300, 0);
	    
	    driver.manage().window().setPosition(p);
	}
}
