package ebayPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class EbayPassword 
{
	
	
	
	@FindBy(id="pass")private WebElement pass;
	
	@FindBy(id="sgnBt")private WebElement signin;
	
	public EbayPassword(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterpassword(WebDriver driver,String pas) 
	{
		pass.sendKeys(pas);
		Reporter.log("entering password",true);
	}
	public void clicksignin() 
	{
		signin.click();
		Reporter.log("signing inn",true);
	}

}
