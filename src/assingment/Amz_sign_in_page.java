package assingment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_sign_in_page 
{

	
	@FindBy(id="ap_email")private WebElement uid;
	@FindBy(id="continue")private WebElement password;
	
	public Amz_sign_in_page(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Enterid(WebDriver driver,String num) throws IOException 
	{
		uid.sendKeys(num);
		Com_use_methods.screenshort(driver);
	}
	public void password() 
	{
		password.click();
	}
	

}
