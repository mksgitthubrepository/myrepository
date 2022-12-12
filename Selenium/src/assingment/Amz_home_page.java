package assingment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_home_page 
{

	@FindBy(xpath ="//span[@id='nav-link-accountList-nav-line-1']")private WebElement username;
	
	public Amz_home_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void validateuser(WebDriver driver) throws IOException 
	{
		
		String visibleuname = username.getText();
		
		String actualuname = "Hello, Mukul";
		
		if(visibleuname.equals(actualuname)) 
		{
			System.out.println("authorised user");
		}
		else 
		{
	         System.out.println("unauthorised user");
		}		
		Com_use_methods.screenshort(driver);
	}
	
	
}
