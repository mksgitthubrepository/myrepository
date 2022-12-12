package myPackage;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe")	;	
		
       WebDriver driver= new ChromeDriver();
       
        
       
         driver.get("https://www.google.com/");
        
         driver.findElement(By.name("q")).sendKeys("harrier");
         
         Thread.sleep(2000);
         
         List<WebElement> options = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
         
         System.out.println(options.size());
       
         
         
         for(WebElement o:options) 
         {
        	
        	 System.out.println(o.getText());
        	 
         }
         for(WebElement o:options) 
         {
                	 
        	  String expected = "harrier Tata"; 
          	 
          	 String actual = o.getText();    
        
          	 if(expected.equalsIgnoreCase(actual))           
          		                                  
          	 {
          		 o.click();                      
          		 break;                         
     
          	 }
         }

        
         
         driver.findElement(By.linkText("Images")).click();
         
         List<WebElement> img = driver.findElements(By.tagName("img"));
         
         System.out.println("total no of visible images -->>"+img.size());
        }
}