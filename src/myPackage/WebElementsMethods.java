package myPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods 

{
	public static void main(String[] args) throws InterruptedException 
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
	    
	    WebDriver driver=new ChromeDriver();
	 
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    Thread.sleep(2000);
	  
	    driver.findElement(By.xpath("//a[text()='PRACTICE']")).click();
	    driver.findElement(By.xpath("(//input[@name='radio'])[1]")).click();
	    System.out.println(driver.findElement(By.xpath("(//input[@name='radio'])[1]")).isSelected());
	   
	    driver.findElement(By.name("show-hide")).sendKeys("mukul");

	    driver.findElement(By.id("hide-textbox")).click();
	    System.out.println( driver.findElement(By.name("show-hide")).isDisplayed());
	    driver.findElement(By.id("show-textbox")).click();
	    driver.findElement(By.name("show-hide")).clear();
	    System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText());
	   
	    driver.navigate().to("https://account.xiaomi.com/");
	    
	    System.out.println(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());
	    
	    
	    
	    
	   
	    
	    
	  
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
