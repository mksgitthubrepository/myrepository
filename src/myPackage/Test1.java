package myPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
  public static void main(String[] args) throws IOException, InterruptedException 
  
  {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUKUL\\Desktop\\AUTO\\selenium\\chromedriver.exe");
	 
	 
	 WebDriver driver = new ChromeDriver();
	 
	 
	 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Damazon%2Bsign%26i%3Delectronics%26adgrpid%3D59527504272%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMI5bbE24ah-wIVDw4rCh01ZQQpEAAYASAAEgJV7fD_BwE%26hvadid%3D597352931660%26hvdev%3Dc%26hvlocphy%3D9075255%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D13478361190253745238%26hvtargid%3Dkwd-365111317397%26hydadcr%3D19941_2255885%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	 
	 driver.findElement(By.id("ap_email")).sendKeys("7057101311");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.id("continue")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("ap_password")).sendKeys("7057101311");
	 
	 driver.findElement(By.id("signInSubmit")).click();
	 
	 String user = driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
	 
	 
 String actualuser = "Hello, Mukul";
	 
     if(user.equals(actualuser)) 
     {
    	 System.out.println("authorised user");
     }
     else 
     {
    	 System.out.println("unathorized user");
     }
	 
	 
	 
}
  
  
}
