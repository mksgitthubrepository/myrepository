package myPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebdriverMethos 
{
    
	public static void main(String[] args) throws IOException, InterruptedException 
	 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\msedgedriver.exe");
		 
		WebDriver driver= new EdgeDriver();     //to launch the browser the browser
		
		driver.get("https://vctcpune.com/");   // enter URL in launched browser
		
		driver.manage().window().maximize();  //  to maximize window   
		
		System.out.println(driver.getCurrentUrl());   //to get current window URL
		
		System.out.println(driver.getTitle());       //to get current window title
		
        driver.navigate().to("https://vctcpune.com/selenium/practice.html");  //to navigate to Page 
        
        driver.navigate().back();     //navigate to back page  
        
        driver.navigate().forward();   //navigate to next page

		driver.manage().window().minimize();  //to minimize current window open by s.
		
		driver.close();   // to close the current tab open by s .
		
		driver.quit();   // to close all tabs open by s. and close the browser also.
		
		
	
	}
}
