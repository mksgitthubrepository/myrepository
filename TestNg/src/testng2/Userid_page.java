package testng2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userid_page
{
	  @FindBy(name="userId")private WebElement UID;
		
		@FindBy(name="password")private WebElement pass;
		
		@FindBy(xpath="//button[@id='submit-btn']")private WebElement signin;
		
		
		
		public Userid_page(WebDriver driver) 
		{
			PageFactory.initElements(driver,this );
		}
		
		
		public void userid(String id)
		{
			UID.sendKeys(id);
			
		}
		public void password(String pas) 
		{
			pass.sendKeys(pas);
		}
		public void signin() 
		{
			signin.click();;
		}
		
	
}
