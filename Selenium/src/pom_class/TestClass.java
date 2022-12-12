package pom_class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
		 
	    WebDriver driver =new ChromeDriver();
	    
	    
	    driver.manage().window().maximize();
	   	    
	    driver.get("https://login-v2.upstox.com/");
		
		UserdetaiIls user =new UserdetaiIls(driver);
		
		user.userid();
		user.password();
		user.signin();
		
		
		
		Thread.sleep(2000);
	    Yob y=new Yob(driver);
	
	    y.yearofbirth();
		
	    Thread.sleep(2000);
	    WelcomePage wp=new WelcomePage(driver);
	    
	    wp.accept();
	    
	    //UserdetaiIls.test();
	    
	}

}
