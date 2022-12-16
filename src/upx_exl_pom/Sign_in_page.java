package upx_exl_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in_page 
{

    @FindBy(name="userId")private WebElement UID;
	
	@FindBy(name="password")private WebElement pass;
	
	@FindBy(xpath="//button[@id='submit-btn']")private WebElement signin;
	
	
	
	public Sign_in_page(WebDriver driver) 
	{
		PageFactory.initElements(driver,this );
	}
	public void enteruid(String id) 
	{
		UID.sendKeys(id);
	}
	public void enterpass(String passw) 
	{
		pass.sendKeys(passw);
	}
	
	public void signin() 
	{
		signin.click();
	}
}
