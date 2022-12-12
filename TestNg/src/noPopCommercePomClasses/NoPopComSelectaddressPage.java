package noPopCommercePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoPopComSelectaddressPage 
{
	
	
	@FindBy(xpath = "//button[@name='save'][1]")private WebElement continueb;
	
	
	public NoPopComSelectaddressPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void addressselcet() 
	{
		
		continueb.click();
		
	}
	

}
