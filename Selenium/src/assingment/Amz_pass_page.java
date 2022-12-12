package assingment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_pass_page 
{
   
	@FindBy(id="ap_password") private WebElement pass;
	@FindBy(id="signInSubmit")private WebElement submit;
	
	public Amz_pass_page(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
	}
	
	public void pass(WebDriver driver,String pn) throws IOException
	{
		pass.sendKeys(pn);
		Com_use_methods.screenshort(driver);
	}
	public void submitbut() 
	{
		submit.click();
	}
	public static void test() 
	{
		System.out.println("stat method from pom ");
	}
}
