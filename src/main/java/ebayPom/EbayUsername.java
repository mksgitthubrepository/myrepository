package ebayPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class EbayUsername 
{
	
	
	
	@FindBy(id="userid")private WebElement username;
	@FindBy(id="signin-continue-btn")private WebElement button;
	
	
	public EbayUsername(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterusername(WebDriver driver ,String name) 
	{
		if (username.isDisplayed()) 
		{
			username.sendKeys(name);
			Reporter.log("entering email",true);
			
		} else 
		{
			Reporter.log("done with username",true);

		}
		
	}
	
	public void continuebutton() 
	{
		if (button.isDisplayed()) 
		{
			 button.click();	
			   Reporter.log("clicking continue button",true);
			
		}
		else
		{
			Reporter.log("done with continue",true);

		}
	  
	}
	
	

}
