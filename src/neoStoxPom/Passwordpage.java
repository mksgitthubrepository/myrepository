package neoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Passwordpage 
{
	
	@FindBy(id="txt_accesspin") private WebElement passcode;
	@FindBy(id="lnk_submitaccesspin") private WebElement submit;
	
	
	public Passwordpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterpasscode(WebDriver driver, String pass) 
	{
		passcode.sendKeys(pass);
		
	}
	public void submitbutton() 
	{
		submit.click();
		
	}
	
	
	
	
	
	

}
