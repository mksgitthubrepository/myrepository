package noPopCommercePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoPopComCartPage 
{
	
	
	@FindBy(xpath = "//input[@id='termsofservice']")private WebElement acceptterms;
	@FindBy(xpath="//button[@id='checkout']")private WebElement checkout;
	;
	
	
	public NoPopComCartPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void Checkout() 
	{
		
		acceptterms.click();
		checkout.click();
		
	}

}
