package neoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import neoStoxUtility.NeoStoxUtility;

public class Signinpage 
{
	
	@FindBy(name="ctl00$MainContent$signinsignup$txt_mobilenumber") private WebElement id;
	@FindBy(id ="lnk_signup1") private WebElement signin;
	
	
	public Signinpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void entermobilenumber(WebDriver driver ,String num) 
	{
		NeoStoxUtility.Wait(driver, 2);
		
		id.sendKeys(num);
		
	}
	public void signin() 
	{
		signin.click();
	}

}
