package noPopCommercePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoPopComShippingMethodPage 
{
	
	
	
	@FindBy(xpath = "(//button[@type='button'])[7]")private WebElement continueb;

	
	public NoPopComShippingMethodPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void shipping() 
	{
		
		continueb.click();
		
		
	}
	
	
}
