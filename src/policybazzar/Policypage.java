package policybazzar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Policypage 
{

	@FindBy(xpath="//div[@class='profile']//ul")private WebElement user;
	
	
	public Policypage(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void uderd() 
	{
		user.getText();
		
	}
	
}
